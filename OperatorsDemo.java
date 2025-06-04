public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // 15
        System.out.println("a - b = " + (a - b));  // 5
        System.out.println("a * b = " + (a * b));  // 50
        System.out.println("a / b = " + (a / b));  // 2
        System.out.println("a % b = " + (a % b));  // 0

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = " + c);      // 10
        c += 5;
        System.out.println("c += 5 -> " + c); // 15
        c *= 2;
        System.out.println("c *= 2 -> " + c); // 30

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 3;
        System.out.println("d = " + d);          // 3
        System.out.println("++d = " + (++d));    // 4
        System.out.println("d++ = " + (d++));    // 4
        System.out.println("Now d = " + d);      // 5
        System.out.println("--d = " + (--d));    // 4


        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int e = 6, f = 3;
        System.out.println("e & f = " + (e & f)); // 2 (110 & 011 = 010)
        System.out.println("e | f = " + (e | f)); // 7 (110 | 011 = 111)
        System.out.println("e ^ f = " + (e ^ f)); // 5 (110 ^ 011 = 101)
        System.out.println("~e = " + (~e));       // -7 [~00000110 → 11111001 =  -7]
        System.out.println("a << 1 = " + (a << 1)); // 12 [00000110 → 00001100 =   12]
        System.out.println("a >> 1 = " + (a >> 1)); // 3 [00000110 → 00000011  =  3]

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // actual implementation of Ternary Operator
        if (a > b)
            max = a;
        else
            max = b;
        System.out.println("Max of a and b is" + max);
    }
}
