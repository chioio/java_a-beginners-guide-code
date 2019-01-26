package _3_program_control_statements;

// Demonstrate the switch without break statements.
class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
                case 4:
                    System.out.println("i is less than five");
            }
            System.out.println();
        }

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i is 1, 2 or 3");
                    break;
                case 4:
                    System.out.println("i is 4");
                    break;
            }
        }
    }
}

/* ***************************************
 * Run:
 *      i is less than one
 *      i is less than two
 *      i is less than three
 *      i is less than four
 *      i is less than five
 *
 *      i is less than two
 *      i is less than three
 *      i is less than four
 *      i is less than five
 *
 *      i is less than three
 *      i is less than four
 *      i is less than five
 *
 *      i is less than four
 *      i is less than five
 *
 *      i is less than five
 *
 *
 *      i is 1, 2 or 3
 *      i is 1, 2 or 3
 *      i is 1, 2 or 3
 *      i is 4
 *
 * ***************************************
 */