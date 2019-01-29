package _3_program_control_statements;

// A negatively running for loop.
class DecrFor {
    public static void main(String[] args) {
        int x;

        for (x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}

/* ***************************************
 * Run:
 *      100
 *      95
 *      90
 *      85
 *      ...
 *      -85
 *      -90
 *      -95
 *
 * ***************************************
 *  An important point about 'for' loops is that the condition expression is always
 * tested at the top of the loop.
 */