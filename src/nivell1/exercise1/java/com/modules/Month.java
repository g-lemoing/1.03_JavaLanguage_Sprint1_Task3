package nivell1.exercise1.java.com.modules;

import java.util.Objects;

public class    Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equals(final Object m){
        if (m == this) return true;
        if (m == null || getClass() != m.getClass()) return false;
        final Month month = (Month) m;
        return name.equals(month.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
