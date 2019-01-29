package _3_program_control_statements;

// Compute integer powers of 2.
class Power {
    public static void main(String[] args) {
        int e;
        int result;

        for (int i = 0; i < 10; i++ ) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}

/* ***************************************
 * Run:
 *      2 to the 0 power is 1
 *      2 to the 1 power is 2
 *      2 to the 2 power is 4
 *      2 to the 3 power is 8
 *      2 to the 4 power is 16
 *      2 to the 5 power is 32
 *      2 to the 6 power is 64
 *      2 to the 7 power is 128
 *      2 to the 8 power is 256
 *      2 to the 9 power is 512
 *
 * ***************************************
 *  As with the 'for' loop, the 'while checks the conditional expression at the
 * top of the loop, which means that the loop code may not execute at all.
 */