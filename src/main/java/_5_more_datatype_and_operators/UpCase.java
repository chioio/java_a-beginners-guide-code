package _5_more_datatype_and_operators;

// Uppercase letters.
class UpCase {
    /**
     * The value 65503 used in the AND statement is the decimal representation
     * of 1111 1111 1101 1111. Thus, the AND operation leaves all bits in 'ch'
     * unchanged except for the 6th one, which is set to 0.
     *
     * @param args Command-Line arguments.
     */
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // This statement turns off the 6th bit.
            ch = (char) ((int) ch & 65503);     // ch is now uppercase

            System.out.print(ch + " ");
        }
    }
}

/* ***************************************
 * Run:
 *      aA bB cC dD eE fF gG hH iI jJ
 * ***************************************
 * The Bitwise Operators:
 *  The bitwise operators can be used on values of type 'long, int, short, char,
 * or byte'. Bitwise operations cannot be used on 'boolean, float, or double', or
 * class types. They are called the bitwise operators because they are used to
 * test, set, or shift the individual bits that make up a value. Bitwise operations
 * are important to a wide variety of systems-level programming tasks in which
 * status information(查询；审讯) from a device must be interrogated or constructed.
 *      Operator        Result
 *          &       |   Bitwise AND
 *          |       |   Bitwise OR
 *          ^       |   Bitwise exclusive(异) OR
 *          >>      |   Shift right
 *          >>>     |   Unsigned shift right
 *          <<      |   Shift left
 *          ~       |   One's complement(补码) (unary(一元的) NOT)
 *
 * The Bitwise AND, OR, XOR, and NOT Operators:
 *  The bitwise operators AND, OR, XOR, and NOT are '&, |, ^, and ~'. They perform
 * the same operations as their Boolean logical equivalents(相等物；等价物) described
 * in Chapter 2(_2_intro_datatype_and_operators). The difference is that the bitwise
 * operators work on a bit-by-bit basis. The following table shows the outcome of
 * each operation using 1's and 0's:
 *       p       q       p & q       p | q       p ^ q       ~p
 *       0   |   0   |     0     |     0     |     0     |   1
 *       1   |   0   |     0     |     1     |     1     |   0
 *       0   |   1   |     0     |     1     |     1     |   1
 *       1   |   1   |     1     |     1     |     0     |   0
 *  In terms of its most common usage, you can think of the bit wise AND ase a way
 * to turn bits off. That is, any bit that is 0 in either operand will cause the
 * corresponding(相符；相应的) bit in the outcome to be set to 0. For example:
 *          1 1 0 1 0 0 1 1
 *       &  1 0 1 0 1 0 1 0
 *       ------------------
 *          1 0 0 0 0 0 1 0
 */