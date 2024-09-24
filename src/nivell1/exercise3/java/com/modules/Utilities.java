package nivell1.exercise3.java.com.modules;

import java.io.*;
import java.util.*;

public class Utilities {
    public static HashMap<String, String> dataFromFile(String filename) {
        HashMap<String, String> countries = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] arr_line = line.split(" ");
                if (arr_line.length == 2) {
                    countries.put(arr_line[0], arr_line[1]);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return countries;
    }

    public static void mapToFile(Map<String, Integer> map, String filename) throws IOException {
        File outputFile = new File(filename);
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(outputFile));
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bf.write(entry.getKey() + " " + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            assert bf != null;
            bf.close();
        }
    }

    public static Map<String, Integer> askUser (Map<String, String> countries){
        Scanner scan = new Scanner(System.in);
        String nom;
        Map<String, Integer> ratings = new HashMap<>();
        do {
            System.out.println("Entra el teu nom (mínim 3 caracteres):");
            nom = scan.nextLine();
        }
        while (nom.length() < 3);
        ArrayList<String> countryKeys;
        String k;
        int points = 0;
        for (int i = 0; i < 10; i++) {
            countryKeys = new ArrayList<>(countries.keySet());
            k = countryKeys.get(new Random().nextInt(countries.size()));
            System.out.println(k);
            System.out.println("Quina és la capital de " + k + "?");
            String response = scan.nextLine();
            if (response.equals(countries.get(k))) {
                System.out.println("Resposta correcta! Sumes un punt!");
                points++;
            } else {
                System.out.println("Resposta incorrecta, la capital de " + k + " és " + countries.get(k));
            }
            countries.remove(k);
        }
        ratings.put(nom, points);
        return ratings;
    }
}
