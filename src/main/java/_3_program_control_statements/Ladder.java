package _3_program_control_statements;

// Demonstrate an if-else-if ladder.
class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x is one");
            else if (x == 2)
                System.out.println("x is two");
            else if (x == 3)
                System.out.println("x is three");
            else if (x == 4)
                System.out.println("x is four");
            else
                System.out.println("x is not between 1 and 4");     // This is the default statement
        }
    }
}

/* ***************************************
 * Run:
 *      x is not between 1 and 4
 *      x is one
 *      x is two
 *      x is three
 *      x is four
 *      x is not between 1 and 4
 *
 * ***************************************
 * The if-else-if Ladder:
 *  'if-else-if' looks like this:
 *          if (condition)
 *              statement;
 *          else if (condition)
 *              statement;
 *          else if (condition)
 *              statement;
 *          ...
 *          else
 *              statement;
 *  The final 'else' statement will be executed.
 *  If there is no final 'else' and all other conditions are false, no action
 * will take place.
 */