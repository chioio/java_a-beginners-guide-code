package _3_program_control_statements;

// Show square roots of 1 to 99 and the rounding error
class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);

            // compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}

/* ***************************************
 * Run:
 *      Square root of 1.0 is 1.0
 *      Rounding error is 0.0
 *
 *      Square root of 2.0 is 1.4142135623730951
 *      Rounding error is -4.440892098500626E-16
 *
 *      Square root of 3.0 is 1.7320508075688772
 *      Rounding error is 4.440892098500626E-16
 *
 *      ...
 *
 *      Square root of 98.0 is 9.899494936611665
 *      Rounding error is 0.0
 *
 *      Square root of 99.0 is 9.9498743710662
 *      Rounding error is 0.0
 *
 *
 * ***************************************
 * The for Loop:
 *  The general form of the 'for' loop for repeating a single statement is:
 *      for (initialization; condition; iteration) statement;
 *  For repeating a block, the general form is:
 *      for (initialization; condition; iteration)
 *      {
 *          statement sequence
 *      }
 *  The initialization is usually an assignment statement that sets the initial
 * value of the loop control variable, which acts as the counter that controls
 * the loop. The condition is a Boolean expression that determines whether or
 * not the loop will repeat. The iteration expression defines the amount by which
 * the loop control variable will change each time the loop is repeated.
 */