package nivell2.exercise1.java.com.main;

import nivell2.exercise1.java.com.modules.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        System.out.println("Creem una col·lecció hashset");
        Set<Restaurant> restaurants = new HashSet<Restaurant>();
        System.out.println("Afegim a la llista el restaurant 'La Llagosta' amb puntuació 8.");
        restaurants.add(new Restaurant("La Llagosta", 8));
        System.out.println("Llista de restaurants:\n" + restaurants);
        System.out.println("Hi afegim un restaurant amb el mateix nom, però amb una altra puntuació: 6.");
        restaurants.add(new Restaurant("La Llagosta", 6));
        System.out.println("Comprovem que la Llista incorpora el nou restaurant:\n" + restaurants);
        System.out.println("Hi afegim un restaurant amb el mateix nom, i la mateixa puntuació: 8.");
        restaurants.add(new Restaurant("La Llagosta", 8));
        System.out.println("Comprovem que el tercer restaurant no s'incorpora a la Llista a l'estar duplicat:\n" + restaurants);
    }
}
