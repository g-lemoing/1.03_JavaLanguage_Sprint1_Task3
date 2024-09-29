package nivell1.exercise3.java.com.modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CountryQuiz {

    public static HashMap<String, Integer> game(String name, HashMap<String, String> countries){
        ArrayList<String> countryKeys;
        Scanner scan = new Scanner(System.in);
        String k;
        HashMap<String, Integer> ratings = new HashMap<>();
        int points = 0;
        for (int i = 0; i < 10; i++) {
            countryKeys = new ArrayList<>(countries.keySet());
            k = countryKeys.get(new Random().nextInt(countries.size()));
            System.out.println("Quina és la capital de " + k + "?");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase(countries.get(k))) {
                System.out.println("Resposta correcta! Sumes un punt!");
                points++;
            } else {
                System.out.println("Resposta incorrecta, la capital de " + k + " és " + countries.get(k));
            }
            countries.remove(k);
        }
        ratings.put(name, points);
        return ratings;
    }

}
