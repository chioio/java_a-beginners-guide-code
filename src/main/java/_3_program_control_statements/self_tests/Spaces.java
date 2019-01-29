package _3_program_control_statements.self_tests;

// Count spaces.
class Spaces {
    public static void main(String[] args)
    throws java.io.IOException {

        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}

/* ***************************************
 * Run:
 *      Enter a period to stop.
 *      Java JavaScript MySQL MongoDB
 *      GitHub Gitee Docker
 *      Apple Microsoft . Amazon
 *      Spaces: 7
 *
 * ***************************************
 */