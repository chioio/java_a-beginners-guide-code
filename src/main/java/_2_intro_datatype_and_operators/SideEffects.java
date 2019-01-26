package _2_intro_datatype_and_operators;

// Side effects can be important.
class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        /* Here, i is still incremented even though
         * the if statement fails.
         */
        if (false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i);  // displays 1

        /* In this case, i is not incremented because
         * the short-circuit operator skips the increment.
         */
        if (false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i);  // still 1!!
    }
}

/* ***************************************
 * Run:
 *      if statement executed: 1
 *      if statement executed: 1
*
 * ***************************************
 *  If your code expects the right-hand operand of an AND or OR operation to be evaluated,
 * you must use Java's non-short-circuit forms of these operations.
 *
 * Shorthand Assignments:
 *      x = x + 10;
 *      can be written, using Java shorthand, as
 *      x += 10;
 *      x = x - 100;
 *      is the same as
 *      x -= 100;
 *  The general form of the shorthand is
 *      var op = expression;
 *  The arithmetic logical shorthand assignment operators:
 *      +=   |   -=   |   *=   |   /=
 *      -----------------------------
 *      %=   |   &=   |   |=   |   ^=
 */