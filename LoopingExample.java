











public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("While Loop:");
        while (i <=5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
}


public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Do-While Loop:");
        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
    }
}


public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}


// break statement
public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // exits the loop when i equals 5
            }
            System.out.println("i = " + i);
        }
    }
}



//continue statement

public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Continue Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping i = " + i);
                continue;  // skips the rest of the loop for i = 5
            }
            System.out.println("i = " + i);
        }
    }
}
