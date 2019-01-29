package _3_program_control_statements;

// Guess the letter game.
class Guess_1 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();   // read a char from the keyboard

        if (ch == answer) System.out.println("** Right **");
    }
}

/* ***************************************
 * Run:
 *      I'm thinking of a letter between A and Z.
 *      Can you guess it: K
 *      ** Right **
 *
 * ***************************************
 * The if Statement:
 *      if (condition)
 *      {
 *          statement sequence
 *      }
 *      else
 *      {
 *          statement sequence
 *      }
 */


class Guess_2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I'm think of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();   // get a char

        if (ch == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you're wrong.");
    }
}

/* ***************************************
 * Run:
 *      I'm think of a letter between A and Z.
 *      Can you guess it: L
 *      ...Sorry, you're wrong.
 *
 * ***************************************
 */


class Guess_3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm think of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();   // get a char

        if (ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");
            // a nested if
            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}

/* ***************************************
 * Run:
 *      I'm think of a letter between A and Z.
 *      Can you guess it: Z
 *      ...Sorry, you're too high
 *
 * ***************************************
 * Nested ifs:
 * A nested 'if' is an 'if' statement that is the target of another 'if' or 'else'.
 */


// Guess the letter game, 4th version.
class Guess_4 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");

            // read a character
            ch = (char) System.in.read();

            // discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Right **");
            else {
                System.out.print("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}

/* ***************************************
 * Run:
 *      I'm thinking of a letter between A and Z.
 *      Can you guess it: u
 *      ...Sorry, you're too high
 *      Try again!
 *
 *      I'm thinking of a letter between A and Z.
 *      Can you guess it: k
 *      ...Sorry, you're too high
 *      Try again!
 *
 *      I'm thinking of a letter between A and Z.
 *      Can you guess it:
 *      \n
 *      ...Sorry, you're too low
 *      Try again!
 *
 *      I'm thinking of a letter between A and Z.
 *      Can you guess it: K
 *      ** Right **
 *
 * ***************************************
 */