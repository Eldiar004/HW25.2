import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Bishkek",6543));
        cities.add(new City("Osh",3535));
        cities.add(new City("Moscow",33453));
        cities.add(new City("Talas",545));
        cities.add(new City("London",6242));
        cities.add(new City("Toronto",75));
        cities.add(new City("Bishkek",876));
        cities.add(new City("Bishkek",965));
        cities.add(new City("Bishkek",1032));
        Set<City> tree = new TreeSet<>();
        for (City t : cities) {
            if (t.getCode() % 2 == 1) {
                tree.add(t);
            }
        }
        for (City w:tree) {
            System.out.println(w);
        }
        }
    }
