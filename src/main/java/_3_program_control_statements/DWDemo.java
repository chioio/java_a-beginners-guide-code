package _3_program_control_statements;

// Demonstrate the do-while loop.
class DWDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();   // get a char
        } while(ch != 'q');
    }
}

/* ***************************************
 * Run:
 *      Press a key followed by ENTER: a
 *      Press a key followed by ENTER: Press a key followed by ENTER: a
 *      Press a key followed by ENTER: Press a key followed by ENTER: q
 *
 * ***************************************
 * The do-while Loop:
 *  General form:
 *      do {
 *      statement;
 *      } while (condition);
 */