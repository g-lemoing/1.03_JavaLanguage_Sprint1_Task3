package nivell1.exercise1.java.com.main;

import nivell1.exercise1.java.com.modules.Month;

import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Creem una llista per emmagatzemar mesos. Hi afegim tots els mesos llevat de l'agost.");
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("gener"));
        months.add(new Month("febrer"));
        months.add(new Month("març"));
        months.add(new Month("abril"));
        months.add(new Month("maig"));
        months.add(new Month("juny"));
        months.add(new Month("juliol"));
        months.add(new Month("setembre"));
        months.add(new Month("octubre"));
        months.add(new Month("novembre"));
        months.add(new Month("desembre"));
        System.out.println("La llista inicial de mesos és:\n" + months);
        System.out.println("\nAfegim ara el mes d'agost en la posició 8 d'aquesta llista.");
        months.add(7, new Month("agost"));
        System.out.println("La llista de mesos és ara completa i correctament ordenada:\n" + months);

        System.out.println("\nRecorrem ara la llista amb un bucle 'for i'.");
        for (int i = 0; i < months.size(); i++){
            System.out.println("Mes " + (i+1) + ": " + months.get(i).toString());
        }

        System.out.println("\nRecorrem ara la llista amb un iterador en sentit decreixent:");
        for (ListIterator<Month> it = months.listIterator(months.size()); it.hasPrevious();){
            System.out.println("Mes " + (it.previousIndex() + 1) + ": " + it.previous().toString());
        }

        System.out.println("\nFinalment transformem la llista en un HashSet");
        HashSet<Month> monthHashSet = new HashSet<>(months);
        System.out.println("El Hashset dels mesos és:\n" + monthHashSet);
        System.out.println("\nIntentem afegir el mes d'agost al nou HashSet");
        monthHashSet.add(new Month("agost"));
        System.out.println("Comprovem que el hashset no incorpora el mes duplicat:\n" + monthHashSet);
    }
}
