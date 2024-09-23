package nivell1.exercise2.java.com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){
        System.out.println("Creem una llista 1 de integer i l'omplim amb enters fins a 10.");
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 11; i++){
            list1.add(i);
        }
        System.out.println(list1);
        System.out.println("\nCreem una llista 2 amb el mateix contingut que la llista 1, però al revés.");
        List<Integer> list2 = new ArrayList<>(list1.reversed());
        System.out.println(list2);
        System.out.println("\nIterem la llista 1 i inserim cada element en la llista 2.");

        ListIterator<Integer> it = list1.listIterator();
        System.out.println(it.nextIndex());
        System.out.println(list1.get(it.nextIndex()));

        System.out.println(list2);
        while (it.hasNext()){
            list2.add(it.next());
        }
        System.out.println("La llista 2 queda de la següent manera:\n" + list2);
    }
}
