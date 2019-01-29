package _3_program_control_statements;

// Declare loop control variable inside the for
class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5
        for (int i = 1; i <= 5; i++) {
            sum += i;   // i is known throughout the loop
            fact *= i;
        }

        // but, i is not known here

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}

/* ***************************************
 * Run:
 *      Sum is 15
 *      Factorial is 120
 *
 * ***************************************
 *  When you declare a variable inside a 'for' loop, there is one important point
 * remember: the scope of that variable ends when the 'for' statement does.(That
 * is, the scope of the variable is limited to the 'for' loop.)
 */