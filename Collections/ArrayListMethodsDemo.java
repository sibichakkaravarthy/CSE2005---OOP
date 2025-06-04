import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethodsDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();

        // 1. add(E e) - add element to the end
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add: " + list);

        // 2. add(int index, E element) - add element at specific index
        list.add(1, 15);
        System.out.println("After add at index 1: " + list);

        // 3. addAll(Collection<? extends E> c) - add all elements from another collection
        ArrayList<Integer> anotherList = new ArrayList<>();
        anotherList.add(40);
        anotherList.add(50);
        list.addAll(anotherList);
        System.out.println("After addAll: " + list);

        // 4. addAll(int index, Collection<? extends E> c) - add all at index
        ArrayList<Integer> thirdList = new ArrayList<>();
        thirdList.add(5);
        thirdList.add(7);
        list.addAll(2, thirdList);
        System.out.println("After addAll at index 2: " + list);

        // 5. get(int index) - get element at index
        int val = list.get(3);
        System.out.println("Element at index 3: " + val);

        // 6. set(int index, E element) - replace element at index
        list.set(3, 25);
        System.out.println("After set at index 3: " + list);

        // 7. remove(int index) - remove element at index
        int removedVal = list.remove(2);
        System.out.println("Removed element at index 2: " + removedVal);
        System.out.println("After remove at index 2: " + list);

        // 8. remove(Object o) - remove first occurrence of object
        boolean isRemoved = list.remove(Integer.valueOf(40));
        System.out.println("Removed 40? " + isRemoved);
        System.out.println("After remove object 40: " + list);

        // 9. contains(Object o) - check if element exists
        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Contains 100? " + list.contains(100));

        // 10. indexOf(Object o) - first occurrence index
        System.out.println("Index of 20: " + list.indexOf(20));

        // 11. lastIndexOf(Object o) - last occurrence index
        list.add(20); // adding duplicate 20
        System.out.println("List after adding duplicate 20: " + list);
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        // 12. size() - size of list
        System.out.println("Size of list: " + list.size());

        // 13. isEmpty() - check if list empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 14. clear() - remove all elements
        ArrayList<Integer> tempList = new ArrayList<>(list); // copy list for demonstration
        tempList.clear();
        System.out.println("Temp list after clear(): " + tempList);

        // 15. toArray() - convert to array
        Object[] arr = list.toArray();
        System.out.print("Array elements: ");
        for (Object o : arr) System.out.print(o + " ");
        System.out.println();

        // 16. iterator() - get iterator and traverse
        System.out.print("Iterating using Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 17. containsAll(Collection<?> c) - check if contains all elements of another collection
        ArrayList<Integer> checkList = new ArrayList<>();
        checkList.add(10);
        checkList.add(50);
        System.out.println("Contains all elements of checkList? " + list.containsAll(checkList));

        // 18. removeAll(Collection<?> c) - remove all elements present in c
        list.removeAll(checkList);
        System.out.println("After removeAll(checkList): " + list);

        // 19. retainAll(Collection<?> c) - retain only elements present in c
        list.add(50);
        list.add(60);
        System.out.println("List before retainAll: " + list);
        list.retainAll(anotherList);
        System.out.println("After retainAll(anotherList): " + list);

        // 20. subList(int fromIndex, int toIndex) - get sublist view
        ArrayList<Integer> subList = new ArrayList<>(anotherList.subList(0, 1));
        System.out.println("Sublist of anotherList (0 to 1): " + subList);

        // 21. sort(Comparator) - sort list
        ArrayList<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(30);
        unsortedList.add(10);
        unsortedList.add(20);
        System.out.println("Unsorted list: " + unsortedList);
        Collections.sort(unsortedList);
        System.out.println("Sorted list: " + unsortedList);

        // 22. ensureCapacity(int minCapacity) - (not usually demonstrated as no direct output)
        unsortedList.ensureCapacity(100);
        System.out.println("Called ensureCapacity(100) on unsortedList.");

        // 23. trimToSize() - trims capacity to current size (no direct output)
        unsortedList.trimToSize();
        System.out.println("Called trimToSize() on unsortedList.");
    }
}
