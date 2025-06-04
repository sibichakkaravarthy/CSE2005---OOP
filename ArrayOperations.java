public class ArrayOperations {
    public static void main(String[] args) {
        // 1. Creating an array using array literals
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };

        // 2. Accessing elements at 4th and 5th positions (index 3 and 4)
        System.out.println("Element at 4th position (index 3): " + numbers[3]);
        System.out.println("Element at 5th position (index 4): " + numbers[4]);

        // 3. Setting (modifying) array element at 4th position
        numbers[3] = 99;
        System.out.println("Updated element at 4th position: " + numbers[3]);

        // 4. Printing the length of the array
        System.out.println("Length of the array: " + numbers.length);

        // 5. Printing all elements of the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
