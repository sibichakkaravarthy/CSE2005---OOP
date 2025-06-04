import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class HashSetMethodsDemo {
    public static void main(String[] args) {
        // Create a HashSet of Integer
        HashSet<Integer> set = new HashSet<>();

        // 1. add(E e) - add element to set
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("After add: " + set);

        // 2. addAll(Collection<? extends E> c) - add all elements from another collection
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(40);
        anotherSet.add(50);
        set.addAll(anotherSet);
        System.out.println("After addAll: " + set);

        // 3. remove(Object o) - remove element
        boolean removed = set.remove(20);
        System.out.println("Removed 20? " + removed);
        System.out.println("After remove 20: " + set);

        // 4. contains(Object o) - check if element exists
        System.out.println("Contains 10? " + set.contains(10));
        System.out.println("Contains 100? " + set.contains(100));

        // 5. size() - size of set
        System.out.println("Size of set: " + set.size());

        // 6. isEmpty() - check if set empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 7. clear() - remove all elements
        HashSet<Integer> tempSet = new HashSet<>(set);
        tempSet.clear();
        System.out.println("Temp set after clear(): " + tempSet);

        // 8. iterator() - iterate over set elements
        System.out.print("Iterating using Iterator: ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 9. containsAll(Collection<?> c) - check if contains all elements of another collection
        HashSet<Integer> checkSet = new HashSet<>();
        checkSet.add(10);
        checkSet.add(50);
        System.out.println("Contains all elements of checkSet? " + set.containsAll(checkSet));

        // 10. removeAll(Collection<?> c) - remove all elements in c
        set.removeAll(checkSet);
        System.out.println("After removeAll(checkSet): " + set);

        // 11. retainAll(Collection<?> c) - retain only elements present in c
        set.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Set before retainAll: " + set);
        set.retainAll(anotherSet);
        System.out.println("After retainAll(anotherSet): " + set);

        // 12. toArray() - convert to array
        Object[] arr = set.toArray();
        System.out.print("Array elements: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // 13. equals(Object o) - compare sets
        HashSet<Integer> equalSet = new HashSet<>();
        equalSet.add(40);
        equalSet.add(50);
        System.out.println("Set equals equalSet? " + set.equals(equalSet));

        // 14. hashCode() - get hashcode of set
        System.out.println("Hash code of set: " + set.hashCode());
    }
}
