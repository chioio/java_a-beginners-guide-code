package _3_program_control_statements;

// Parts of the for can be empty.
class Empty_1 {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;    // increment loop control var
        }
    }
}

/* ***************************************
 * Run:
 *      Pass #0
 *      Pass #1
 *      Pass #2
 *      Pass #3
 *      Pass #4
 *      Pass #5
 *      Pass #6
 *      Pass #7
 *      Pass #8
 *      Pass #9
 *
 * ***************************************
 * Missing Pieces:
 *  In Java, it is possible for any or all of the initialization, condition, or
 * iteration portions of the 'for' loop to be blank.
 */



// Move more out of the for loop.
class Empty_2 {
    public static void main(String[] args) {
        int i;

        i = 0;      // move initialization out of loop
        for (; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;    // increment loop control var
        }
    }
}

/* ***************************************
 * Run:
 *      Pass #0
 *      Pass #1
 *      Pass #2
 *      Pass #3
 *      Pass #4
 *      Pass #5
 *      Pass #6
 *      Pass #7
 *      Pass #8
 *      Pass #9
 *
 * ***************************************
 */


// The body of a loop can be empty.
class Empty_3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // sum the number through 5
        for (i = 1; i <= 5; sum += i++);    // No body in this loop

        System.out.println("Sum is " + sum);
    }
}

/* ***************************************
 * Run:
 *      Sum is 15
 *
 * ***************************************
 */