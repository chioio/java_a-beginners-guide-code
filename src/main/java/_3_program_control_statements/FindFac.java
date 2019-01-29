package _3_program_control_statements;

/*
 * Use nested loops to find factors of numbers
 * between 2 and 100;
 */
class FindFac {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}

/* ***************************************
 * Run:
 *      Factors of 2:
 *      Factors of 3:
 *      Factors of 4: 2
 *      ...
 *      Factors of 96: 2 3 4 6 8 12 16 24 32 48
 *      Factors of 97:
 *      Factors of 98: 2 7 14 49
 *      Factors of 99: 3 9 11 33
 *      Factors of 100: 2 4 5 10 20 25 50
 *
 * ***************************************
 */