package _3_program_control_statements;

// Use continue.
class ContDemo {
    public static void main(String[] args) {
        int i;

        // print even numbers between 0 and 100
        for (i = 0; i<= 100; i++) {
            if ((i%2) != 0) continue;   // iterate
            System.out.println(i);
        }
    }
}

/* ***************************************
 * Run:
 *      0
 *      2
 *      4
 *      6
 *      ...
 *      96
 *      98
 *      100
 *
 * ***************************************
 * Use continue:
 *  The 'continue' statement forces the next iteration of the loop to take place,
 * skipping any code between itself and the conditional expression that controls
 * the loop. Thus,'continue' is essentially the complement of 'break'.
 */