package _2_intro_datatype_and_operators;

// Demonstrate the short-circuit operators
class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0;      // now, set d to zero

        // Since d is zero, the second operand is not evaluated
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        /* Now, try same thing without short-circuit operator.
            This will cause a divide-by-zero error.
         */
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}

/* ***************************************
 * Run:
 *      2 is a factor of 10
 *      'Exception in thread "main" java.lang.ArithmeticException: / by zero
 *  	at _2_intro_datatype_and_operators.SCops.main(SCops.java:21)'
 *
 * ***************************************
 * Short-Circuit Logical Operators:
 *  In an AND operation, if the first operand is false, hte outcome is false no matter
 * what value the second operand has. In an OR operation, if the first operand is true,
 * the outcome of the operation is true no matter what the value of the second operand.
 *  The short-circuit AND operator is '&&', and the short-circuit OR operator is '||'.
 *
 *  One last point: The formal specification for Java refers to the short-circuit operators
 * as the conditional-or and the conditional-and operators, but the term "short-circuit"
 * is commonly used.
 */