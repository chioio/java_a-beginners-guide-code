package _3_program_control_statements;

// Use commas in a for statement
class Comma {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " +j);
    }
}

/* ***************************************
 * Run:
 *      i and j: 0 10
 *      i and j: 1 9
 *      i and j: 2 8
 *      i and j: 3 7
 *      i and j: 4 6
 * ***************************************
 */