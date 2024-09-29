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
        System.out.println("\nCreem una llista 2 buida.");
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Iterem la llista 1 des del final i inserim cada element en la llista 2.");

        ListIterator<Integer> it = list1.listIterator(list1.size());

        while (it.hasPrevious()){
            list2.add(it.previous());
        }
        System.out.println("La llista 2 queda de la següent manera:\n" + list2);
    }
}
