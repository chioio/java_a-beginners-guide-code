package _5_more_datatype_and_operators;

// Prevent a division by zero using the ?.
class NoZeroDiv_1 {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;
            if (i != 0)
                System.out.println("100 / " + i + " is " + result);
        }
    }
}

/* ***************************************
 * Run:
 *      100 / -5 is -20
 *      100 / -4 is -25
 *      100 / -3 is -33
 *      100 / -2 is -50
 *      100 / -1 is -100
 *      100 / 1 is 100
 *      100 / 2 is 50
 *      100 / 3 is 33
 *      100 / 4 is 25
 *      100 / 5 is 20
 *
 * ***************************************
 * The ? Operator:
 *  The '?' operator is often used to replace 'if-else' statements of this
 * general form:
 *      if (condition)
 *          var = expression1;
 *      else
 *          var = expression2;
 *  The '?' is called a ternary operator because it requires three operands.
 * It takes the general form
 *      Exp1 ? Exp2 : Exp3;
 * where Exp1 is a 'boolean' expression, and Exp2 and Exp3 are expressions of
 * any type other than 'void'. The type of Exp2 and Exp3 must be the same (or
 * compatible), though.
 *  The value of a '?' expression is determined like this: Exp1 is evaluated.
 * If it is true, then Exp2 is evaluated and becomes the value of the entire
 * '?' expression. If Exp1 is false, then Exp3 is evaluated and its value
 * becomes the value of the expression.
 */


// Prevent a division by zero using the ?.
class NoZeroDiv_2 {
    public static void main(String[] args) {

        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false)
                System.out.println("100/ " + i + " is " + 100 / i);
        }
    }
}

/* ***************************************
 * Run:
 *      100/ -5 is -20
 *      100/ -4 is -25
 *      100/ -3 is -33
 *      100/ -2 is -50
 *      100/ -1 is -100
 *      100/ 1 is 100
 *      100/ 2 is 50
 *      100/ 3 is 33
 *      100/ 4 is 25
 *      100/ 5 is 20
 *
 * ***************************************
 */