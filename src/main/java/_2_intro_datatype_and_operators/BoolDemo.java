package _2_intro_datatype_and_operators;

// Demonstrate boolean values.
class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement.
        if (b) System.out.println("This is executed.");

        b = false;
        if (b) System.out.println("This is not executed.");

        // outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}

/* ***************************************
 * Run:
 *      b is false
 *      b is true
 *      This is executed.
 *      10 > 9 is true
 *
 * ***************************************
 * The Boolean Type:
 *  The 'boolean' type represents true/false values. Java defines the
 * values true and false using the reserved words 'true' and 'false'.
 */