public class ConditionalExamplesSingleFile {

    // Class for simple if
    static class IfExample {
        void run() {
            int number = 10;
            if (number > 0) {
                System.out.println("IfExample: Number is positive.");
            }
        }
    }

    // Class for if-else
    static class IfElseExample {
        void run() {
            int number = -5;
            if (number >= 0) {
                System.out.println("IfElseExample: Number is non-negative.");
            } else {
                System.out.println("IfElseExample: Number is negative.");
            }
        }
    }

    // Class for if-else-if
    static class IfElseIfExample {
        void run() {
            int marks = 85;
            if (marks >= 90) {
                System.out.println("IfElseIfExample: Grade: A+");
            } else if (marks >= 75) {
                System.out.println("IfElseIfExample: Grade: A");
            } else if (marks >= 60) {
                System.out.println("IfElseIfExample: Grade: B");
            } else {
                System.out.println("IfElseIfExample: Grade: C or below");
            }
        }
    }

    // Class for switch
    static class SwitchExample {
        void run() {
            int day = 3;
            System.out.print("SwitchExample: ");
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

    // Main method to run all examples
    public static void main(String[] args) {
        IfExample ifEx = new IfExample();
        IfElseExample ifElseEx = new IfElseExample();
        IfElseIfExample ifElseIfEx = new IfElseIfExample();
        SwitchExample switchEx = new SwitchExample();

        ifEx.run();
        ifElseEx.run();
        ifElseIfEx.run();
        switchEx.run();
    }
}
