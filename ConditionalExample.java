public class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive.");
        }
    }
}

//If-Else
public class IfElseExample {
    public static void main(String[] args) {
        int number = -5;

        if (number >= 0) {
            System.out.println("Number is non-negative.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}

// if-else-if Ladder
public class IfElseIfExample {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }
    }
}



// switch Statement
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}


