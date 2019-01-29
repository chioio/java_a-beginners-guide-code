package _3_program_control_statements;

// Demonstrate the while loop.
class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // print the alphabet using a while loop
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}

/* ***************************************
 * Run:
 *      a b c d e f g h i j k l m n o p q r s t u v w x y z
 * ***************************************
 * The While Loop:
 *  General form:
 *      while (condition) statement;
 *  Condition defines the condition that controls the loop.
 */