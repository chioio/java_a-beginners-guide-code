package _5_more_datatype_and_operators;

// Lowercase letters.
class LowCase {
    /**
     * The program works by ORing each character with the value 32, which is
     * 0000 0000 0010 0000 in binary. Thus, 32 is the value that produces a
     * value in binary in which only the 6th is set. When this value is ORed
     * with any other value, it produces a result in which the 6th bit is set
     * and all other bits remain unchanged.
     *
     * @param args Command-Line arguments.
     */
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A'+ i);
            System.out.print(ch);

            // This statement turns on the 6th bit
            ch = (char) ((int) ch | 32);    // ch is now lowercase

            System.out.print(ch + " ");
        }
    }
}

/* ***************************************
 * Run:
 *      Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj
 * ***************************************
 *  The bitwise OR, as the reverse of AND, can be used to turn bits on. Any bit
 * that is set to 1 in either operand will cause the corresponding bit in the
 * result to be set to 1. For example:
 *          1 1 0 1 0 0 1 1
 *       |  1 0 1 0 1 0 1 0
 *       ------------------
 *          1 1 1 1 1 0 1 1
 */
