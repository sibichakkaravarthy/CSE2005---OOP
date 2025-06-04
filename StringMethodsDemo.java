public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = " Hello, Java World!  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 3. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // 5. substring()
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));

        // 6. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 7. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("World"));

        // 8. replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 9. startsWith() and endsWith()
        System.out.println("Starts with ' Hello': " + str.startsWith(" Hello"));
        System.out.println("Ends with 'World! ': " + str.endsWith("World! "));

        // 10. equals() and equalsIgnoreCase()
        String str2 = " hello, java world! ";
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2.trim()));
    }
}
