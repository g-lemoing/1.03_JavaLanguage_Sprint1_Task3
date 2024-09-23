package nivell2.exercise2.java.com.main;
import nivell2.exercise2.java.com.modules.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Creem un TreeSet ordenat de forma decreixent per emmagatzemar restaurants.");
        Set<Restaurant> restSorted = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Restaurant o1, Restaurant o2) {
                if (o1.getName().compareTo(o2.getName()) != 0){
                    return o2.getName().compareTo(o1.getName());
                }
                return o2.getRating() - o1.getRating();
            }
        });
        System.out.println("Hi afegim 4 restaurants:");
        System.out.println("La Llagosta amb puntuació 8");
        System.out.println("Barceloneta amb puntuació 9");
        System.out.println("Montjuic amb puntuació 8");
        System.out.println("un altre Montjuic amb puntuació 7");

        restSorted.add(new Restaurant("La Llagosta", 8));
        restSorted.add(new Restaurant("Barceloneta", 9));
        restSorted.add(new Restaurant("Montjuic", 8));
        restSorted.add(new Restaurant("Montjuic", 7));
        System.out.println("\nLlistem els restaurants i comprovem que estan correctament ordenats:");
        for(Restaurant r: restSorted){
            System.out.println(r.toString());
        }
    }
}
