public class AssertionErrorDemo {
    public static void main(String[] args) {
        int age = 15;

        // Assert that age must be 18 or more for voting
        assert age >= 18 : "Age is less than 18 - Not eligible to vote";

        System.out.println("You are eligible to vote!");
    }
}
