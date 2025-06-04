
public class DemoPublicStaticVoidMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        if (args.length > 0) {
            System.out.println("Command-line arguments: " + java.util.Arrays.toString(args));
        }
    }
}


import java.util.Arrays;

public class DemoPublicStaticVoidMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        if (args.length > 0) {
            System.out.println("Command-line arguments: " + Arrays.toString(args));
        }
    }
}


import java.util.Arrays;

public class DemoPublicStaticVoidMain {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        if (args.length > 0) {
            String arguments = Arrays.toString(args);  // Assigning to a variable
            System.out.println("Command-line arguments: " + arguments);
        }
    }
}
