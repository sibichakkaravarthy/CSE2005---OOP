import java.util.*;

public class StudentMarksWithCollection {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();

        // Autoboxing: int to Integer
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(88);
        marks.add(92);

        System.out.println("Elements as it is : " + "\n" + marks + "\n");

        int total = 0;

        // Unboxing: Integer to int
        
        for (int mark : marks) {
            total += mark;
        }

        // Ascending order
        marks.sort(Comparator.naturalOrder());
        System.out.println("ArrayList sorted ascending: " + "\n" + marks + "\n");

        // Descending order
        marks.sort(Comparator.reverseOrder());
        System.out.println("ArrayList sorted descending:" + "\n" +marks + "\n");


        //calculating average 
        double average = total / (double) marks.size();

        System.out.println("Average marks: " + average);
    }
}
