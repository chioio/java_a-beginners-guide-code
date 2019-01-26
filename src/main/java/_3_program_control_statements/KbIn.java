package _3_program_control_statements;

class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        System.out.println("Press a key followed by ENTER: ");

        ch = (char) System.in.read();   // get a char

        System.out.println("Your key is: " + ch);
    }
}

/* ***************************************
 * Run:
 *      Press a key followed by ENTER:
 *      y
 *      Your key is: y
 *
 * ***************************************
 * Input Characters from the Keyboard:
 *  'System.in' is the complement(补充) to 'System.out'. It is the input object
 * attached to the keyboard.
 *
 * There are three categories of program control statements:
 * selection statements, which include the 'if' and the 'switch';
 * iteration statements, which include the 'for','while', and 'do-while' loops;
 * and jump statements, which include 'break','continue',and 'return'.
 */