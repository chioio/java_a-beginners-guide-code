package _2_intro_datatype_and_operators.try_this;

// Try This 2-2: a truth table for the logical operators.
class _2_2_LogicalOpTable {
    public static void main(String[] args) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((q&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((q&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((q&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}

/* ***************************************
 * Run:
 *      P	    Q	    AND	    OR	    XOR	    NOT
 *      true	true	true	true	false	false
 *      true	false	false	true	true	false
 *      false	false	false	false	false	true
 *
 * ***************************************
 * Expressions:
 *  Operators, variables, and literals are constituents of expressions.
 * Type Conversion in Expressions:
 *  Within an expression, it is possible to mix two or more different types
 * of data as long as they are compatible with each other. When different
 * types of data are mixed within an expression, they are all converted to
 * the same type.
 */