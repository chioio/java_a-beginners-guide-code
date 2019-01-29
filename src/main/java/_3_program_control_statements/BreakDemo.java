package _3_program_control_statements;

// Using break to exit a loop.
class BreakDemo_1 {
    public static void main(String[] args) {
        int num;

        num = 100;

        // loop while i-squared is less than num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) break;    //terminate loop if i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}

/* ***************************************
 * Run:
 *      0 1 2 3 4 5 6 7 8 9 Loop complete.
 *
 * ***************************************
 *  It is possible to force an immediate exit from a loop, bypassing any remaining
 * code in the body of the loop and the loop's conditional test, by using the 'break'
 * statement.
 *  When a 'break' statement is encountered inside a loop, the loop is terminated
 *  and program control resumes at the next statement following the loop.
 */


// Read input until a q is received.
class BreakDemo_2 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        for (; ; ) {
            ch = (char) System.in.read();   // get a char
            if (ch == 'q') break;
        }
        System.out.println("You pressed q!");
    }
}

/* ***************************************
 * Run:
 *      q
 *      You pressed q!
 *
 * ***************************************
 */


// Using break with nested loops.
class BreakDemo_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.print("    Inner loop count: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) break;     //terminate loop if t is 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}

/* ***************************************
 * Run:
 *      Outer loop count: 0
 *          Inner loop count: 0 1 2 3 4 5 6 7 8 9
 *      Outer loop count: 1
 *          Inner loop count: 0 1 2 3 4 5 6 7 8 9
 *      Outer loop count: 2
 *          Inner loop count: 0 1 2 3 4 5 6 7 8 9
 *      Loops complete.
 *
 * ***************************************
 *  When used inside a set of nested loops, the 'break' statement will break out
 * of only the innermost loop.
 *  However, be careful. Too many 'break' statements have the tendency to destructure(破坏)
 *  your code. Second, the 'break' that terminates a 'switch' statement affects
 *  only that 'switch' statement and not any enclosing loops.
 */


// Using break with a label.
class BreakDemo_4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        // this is never reached
                        System.out.println("won't print");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
    }
}

/* ***************************************
 * Run:
 *
 *      i is 1
 *      After block one.
 *
 *      i is 2
 *      After block two.
 *      After block one.
 *
 *      i is 3
 *      After block three.
 *      After block two.
 *      After block one.
 *
 * ***************************************
 * Use break as a Form of goto
 *  The goto can be helpful when exiting from a deeply nested set of loops.
 *  General form:
 *      break label;
 *  Typically, label is the name of a label that identifies a block of code. When
 * this form of 'break' executes, control is transferred out of the named block
 * of code. The labeled block of code must enclose the 'break' statement, but it
 * does not need to be the immediately enclosing block. This means that you can
 * use a labeled 'break' statement to exit from a set of nested blocks. But you
 * cannot use 'break' to transfer control to a block of code that does not enclose
 * the 'break' statement.
 *  To name a block, put a label at the start of it. The block being labeled can
 * be a stand-alone block, or a statement that has a block as its target. A label
 * is any valid Java identifier followed by a colon.
 *  Once you have labeled a block, you can then use this label as the target of a
 * 'break' statement.
 */


// Another example of using break with a label.
class BreakDemo_5 {
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;     // jump to done
                }
                System.out.println("After k loop");     // won't execute
            }
            System.out.println("After j loop");     // won't execute
        }
        System.out.println("After i loop");
    }
}

/* ***************************************
 * Run:
 *      0
 *      1
 *      2
 *      3
 *      4
 *      5
 *      After i loop
 *
 * ***************************************
 */


// Where you put a label is important.
class BreakDemo_6 {
    public static void main(String[] args) {
        int x = 0, y = 0;

        // here, put label before for statement.
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        // now, put label immediately before {
        for (x = 0; x < 5; x++)
            stop2:{
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}

/* ***************************************
 * Run:
 *      x and y: 0 0
 *      x and y: 0 1
 *
 *      x and y: 0 0
 *      x and y: 0 1
 *      x and y: 1 0
 *      x and y: 1 1
 *      x and y: 2 0
 *      x and y: 2 1
 *      x and y: 3 0
 *      x and y: 3 1
 *      x and y: 4 0
 *      x and y: 4 1
 *
 * ***************************************
 *  Keep in mind that you cannot 'break' to any label that is not defined for an
 * enclosing block.
 */