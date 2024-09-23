package nivell2.exercise1.java.com.modules;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int rating;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + name + '\'' +
                ", puntuació=" + rating +
                '}';
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
