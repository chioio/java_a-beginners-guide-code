package _5_more_datatype_and_operators;

// Display all command-line information.
public class CLDemo {
    public static void main(String[] args) {

        args = new String[] {"one", "two", "three"};

        System.out.println("There are " + args.length +
                " command-line arguments.");

        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}

/* ***************************************
 * Run:
 * (java CLDemo one two three)
 *      There are 3 command-line arguments.
 *      They are:
 *      arg[0]: one
 *      arg[1]: two
 *      arg[2]: three
 *
 * ***************************************
 * Using Command-Line Arguments
 *  Many programs accept what are called command-line arguments. A command-line
 * argument is the information that directly follows the program's name on the
 * command line when it is executed. To access the command-line are stored as
 * strings in the 'String' array passed to 'main()'.
 *
 *  Notice this program, the first argument is stored at index 0, the second
 * argument is stored at index 1, and so on.
 */