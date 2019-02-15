package _5_more_datatype_and_operators;

// Demonstrate a two-dimensional array.
class TwoD {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[3][4];

        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table [t][i] = (t*4) + i+1;
                System.out.print(table[t][i] + "\t");
            }
            System.out.println();
        }
    }
}

/* ***************************************
 * Run:
 *      1	2	3	4
 *      5	6	7	8
 *      9	10	11	12
 *
 * ***************************************
 * Two-Dimensional Arrays:
 *  A two-dimensional array is, in essence, a list of one-dimensional arrays.
 */