package _5_more_datatype_and_operators;

// Demonstrate the shift << and >> operators.
class ShiftDemo {
    public static void main(String[] args) {
        int val = 1;

        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val << 1;     // left shift
        }
        System.out.println();

        val = 128;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1;     // right shift
        }
    }
}

/* ***************************************
 * Run:
 *      0 0 0 0 0 0 0 1
 *      0 0 0 0 0 0 1 0
 *      0 0 0 0 0 1 0 0
 *      0 0 0 0 1 0 0 0
 *      0 0 0 1 0 0 0 0
 *      0 0 1 0 0 0 0 0
 *      0 1 0 0 0 0 0 0
 *      1 0 0 0 0 0 0 0
 *
 *      1 0 0 0 0 0 0 0
 *      0 1 0 0 0 0 0 0
 *      0 0 1 0 0 0 0 0
 *      0 0 0 1 0 0 0 0
 *      0 0 0 0 1 0 0 0
 *      0 0 0 0 0 1 0 0
 *      0 0 0 0 0 0 1 0
 *      0 0 0 0 0 0 0 1
 *
 * ***************************************
 * The Shift Operators:
 *  Java defines the three bit-shift operators shown here:
 *      <<  |   Left shift
 *      >>  |   Right shift
 *      >>> |   Unsigned right shift
 *  The general forms for these operators are shown here:
 *      value << num-bits
 *      value >> num-bits
 *      value >>> num-bits
 *
 *  As you may know, negative numbers are usually represented by setting the
 * high-order bit of an integer value to 1, and this is the approach used by
 * Java. Thus, if the value being shifted is negative, each right shift brings
 * in a 1 on the left. If the value is positive, each right shift bring in a
 * 0 on the left.
 *  If you don't want to preserve the sign bit when shifting right, you can use
 * an unsigned right shift (>>>), which always brings in a 0 on the left. For
 * this reason, the '>>>' is also called the zero-fill shift.
 *  For all of the shifts, the bits shifted ou are lost. Thus, a shift is not a
 * rotate(轮换), and there is no way to retrieve(取回；恢复) a bit that has been
 * shifted out.
 *
 *  You need to be careful when shifting 'byte' and 'short' values because Java
 * will automatically promote these types to 'int' when evaluating an expression.
 */