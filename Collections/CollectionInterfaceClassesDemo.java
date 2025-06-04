import java.util.*;

public class CollectionInterfaceClassesDemo {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Milk"); // duplicates allowed

        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("India"); // duplicate ignored

        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington");


        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("VIT", 90);
        scores.put("AP", 85);
        scores.put("VIT", 95); // overwrites old value

        System.out.println("List: " + shoppingList);
        System.out.println("Set: " + countries);
        System.out.println("Map: " + capitals);
        System.out.println(scores);
    }
}
