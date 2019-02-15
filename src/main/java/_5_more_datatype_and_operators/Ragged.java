package _5_more_datatype_and_operators;

// Manually allocate differing size second dimensions.
class Ragged {
    public static void main(String[] args) {
        int[][] riders = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i, j;

        // fabricate some fake data (制作一些假数据)
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;

        System.out.println("Riders per trip during the week: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }

        System.out.println();

        System.out.println("Riders per trip on the weekend: ");
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}

/* ***************************************
 * Run:
 *      Riders per trip during the week:
 *      10 11 12 13 14 15 16 17 18 19
 *      11 12 13 14 15 16 17 18 19 20
 *      12 13 14 15 16 17 18 19 20 21
 *      13 14 15 16 17 18 19 20 21 22
 *      14 15 16 17 18 19 20 21 22 23
 *
 *      Riders per trip on the weekend:
 *      15 16
 *      16 17
 *
 * ***************************************
 * Irregular Arrays:
 *  When you allocate memory for a multidimensional array, you need to specify
 * only the memory for the first (leftmost) dimension. You can allocate the
 * remaining dimensions separately.
 *
 * Arrays of Three or More Dimensions:
 *  Java allows arrays with more than two dimensions. Here is the General form
 * of a multidimensional array declaration:
 *      type name[][]...[] = new type[size1][size2]...[sizeN];
 */