package nivell1.exercise3.java.com.main;

import nivell1.exercise3.java.com.modules.CountryQuiz;
import nivell1.exercise3.java.com.modules.Utilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        final String OUTPUT_FILE = "classificacio.txt";
        final String INPUT_FILE = "countries.txt";

        System.out.println("S'està carregant la llista de països.");
        HashMap<String, String> countries = Utilities.dataFromFile(INPUT_FILE);
        System.out.println("Càrrega finalitzada amb " + countries.size() + " entrades.");
        System.out.println("Et preguntarem per la capital de 10 països.");
        System.out.println("Per a cada resposta correcta marcaràs 1 punt.");
        String nom = Utilities.askUser();

        Map<String, Integer> ratings = CountryQuiz.game(nom, countries);

        Utilities.mapToFile(ratings, OUTPUT_FILE);
        System.out.println("Pots consultar la teva puntuació al fitxer " + OUTPUT_FILE);
    }
}
