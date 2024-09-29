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
            System.out.println("File not found.");
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

    public static String askUser (){
        Scanner scan = new Scanner(System.in);
        String nom;
        do {
            System.out.println("Entra el teu nom (mínim 3 caracteres):");
            nom = scan.nextLine();
        }
        while (nom.length() < 3);
        return nom;
    }
}
