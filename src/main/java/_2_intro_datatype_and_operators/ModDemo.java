package _2_intro_datatype_and_operators;

// Demonstrate the % operator.
class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
    }
}

/* ***************************************
 * Run:
 *      Result and remainder of 10 / 3: 3 1
 *      Result and remainder of 10.0 / 3.0: 3.3333333333333335 1.0
 *
 * ***************************************
 * Operators:
 *  An operator is an symbol that tells the compiler to perform a specific mathematical
 * or logical manipulation. Java has four general classes of operators: arithmetic,
 * bitwise, relational, and logical.(算术运算符、位运算符、关系运算符、逻辑运算符)
 *  Arithmetic Operators:
 *      Operator        Meaning
 *      +           |   Addition (also unary plus)
 *      -           |   Subtraction (also unary minus)
 *      *           |   Multiplication
 *      /           |   Division
 *      %           |   Modulus
 *      ++          |   Increment
 *      --          |   Decrement
 *  These can be applied to any built-in numeric data type. They can also be used on objects
 * of type 'char'.
 *
 *  Increment and Decrement:
 *      x = x + 1; is the same as x++;
 *      x = x - 1; is the same as x--;
 *  Both the increment and decrement operators can either precede (prefix) or follow (postfix)
 * the operand. For example,
 *      x = x + 1;
 *      can be written as
 *      ++x;    // prefix form
 *      or as
 *      x++     // postfix form
 *  When an increment or decrement operator precedes its operand, Java will perform the
 * corresponding(相映的；相符的) operation prior(在先的；在前的) to obtaining the operand's
 * value for use by the rest of the expression. if the operator follows its operand(运算元；操作数),
 * Java will obtain the operand's value before incrementing or decrementing it.
 *      x = 10; y = ++x;
 *      in this case, y will be set to 11. However, ig the code is written as
 *      x = 10; y = x++;
 *      then y will be set to 10. In both cases, x is still set to 11;
 * the difference is when it happens. There are significant advantages in being able
 * to control when the increment or decrement operation takes place.
 */