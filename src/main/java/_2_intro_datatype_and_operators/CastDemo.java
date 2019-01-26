package _2_intro_datatype_and_operators;

// Demonstrate casting.
class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);    // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88;     // ASCII code for X;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}

/* ***************************************
 * Run:
 *      Integer outcome of x / y: 3
 *      Value of b: 100
 *      ch: X
 *
 * ***************************************
 * Casting Incompatible Types:
 *  A cast has this general form:
 *      (target-type) expression
 */