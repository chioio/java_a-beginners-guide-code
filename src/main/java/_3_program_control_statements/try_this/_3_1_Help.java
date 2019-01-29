package _3_program_control_statements.try_this;

/*
 * Try This 3-1
 *
 * A simple help system.
 */
class _3_1_Help {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;

        System.out.println("Help on: ");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.print("Choose one: ");
        choice = (char) System.in.read();

        System.out.println();

        switch (choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if (condition) statement;");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch (expression) {");
                System.out.println("    case constant: ");
                System.out.println("        statement sequence");
                System.out.println("        break");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found.");
        }
    }
}

/* ***************************************
 * Run:
 *      Help on:
 *          1. if
 *          2. switch
 *      Choose one: 2
 *
 *      The switch:
 *      switch (expression) {
 *          case constant:
 *              statement sequence
 *              break
 *          // ...
 *      }
 *
 * ***************************************
 * When to use 'if=else-if' and 'switch':
 *  In general, use an 'if-else-if' ladder when the conditions controlling the
 * section process do not rely upon a single value.
 */