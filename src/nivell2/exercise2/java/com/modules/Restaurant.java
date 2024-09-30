package nivell2.exercise2.java.com.modules;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant implements Comparator<Restaurant> {
    private String name;
    private int rating;

    public Restaurant(){

    }
    public Restaurant(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "nom: '" + name + '\'' +
                ", puntuació: " + rating;
    }

    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        if (o1.getName().compareTo(o2.getName()) != 0){
            return o2.getName().compareTo(o1.getName());
        }
        return o2.getRating() - o1.getRating();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return rating == that.rating && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

}
