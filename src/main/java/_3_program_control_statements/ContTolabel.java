package _3_program_control_statements;

// Use continue with a label.
class ContTolabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i +
                    ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop;    // continue outer loop
                System.out.print(j);
            }
        }
    }
}

/* ***************************************
 * Run:
 *
 *      Outer loop pass 1, Inner loop: 1234
 *      Outer loop pass 2, Inner loop: 1234
 *      Outer loop pass 3, Inner loop: 1234
 *      Outer loop pass 4, Inner loop: 1234
 *      Outer loop pass 5, Inner loop: 1234
 *      Outer loop pass 6, Inner loop: 1234
 *      Outer loop pass 7, Inner loop: 1234
 *      Outer loop pass 8, Inner loop: 1234
 *      Outer loop pass 9, Inner loop: 1234
 * ***************************************
 *  As with the 'break' statement, 'continue' may specify a label to describe which
 * enclosing loop to continue.
 */