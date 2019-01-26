package _2_intro_datatype_and_operators;

// Character variables can be handled like integers.
class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++;   // increment ch
        System.out.println("ch is now " + ch);

        ch = 90;    // give ch the value Z
        System.out.println("ch is now " + ch);
    }
}

/* ***************************************
 * Run:
 *      ch contains X
 *      ch is now Y
 *      ch is now Z
 *
 * ***************************************
 * A 'char' can be incremented.
 * A 'char' can be assigned an integer value.
 */