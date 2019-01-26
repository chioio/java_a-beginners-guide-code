package _2_intro_datatype_and_operators;

// Demonstrate escape sequences in strings
class StrDemo {
    public static void main(String[] args) {
        System.out.println("First line \nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }
}

/* ***************************************
 * Run:
 *      First line
 *      Second line
 *      A	B	C
 *      D	E	F
 *
 * ***************************************
 * Character Escape Sequences:
 *  Java provides special escape sequences, sometimes referred to as backslash
 * character constants.
 *      Escape Sequence         Description
 *      \'                  |   Single quote
 *      \"                  |   Double quote
 *      \\                  |   Backslash
 *      \r                  |   Carriage return
 *      \n                  |   New line
 *      \f                  |   Form feed
 *      \t                  |   Horizontal tab
 *      \b                  |   Backspace
 *
 * String Literals
 *  String is a set of characters enclosed by double quotes.
 */