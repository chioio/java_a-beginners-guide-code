package _5_more_datatype_and_operators;

// Use a for-each style for loop.
class ForEach_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Use for-each style for to display and sum the values.
        for (int x :
                nums) {
            System.out.println("Values is: " + x);
            sum += x;

            if (x == 5) break;  // stop the loop when 5 is obtained
        }
        System.out.println("Summation: " + sum);
    }
}

/* ***************************************
 * Run:
 *      Values is: 1
 *      Values is: 2
 *      Values is: 3
 *      Values is: 4
 *      Values is: 5
 *      Summation: 15
 *
 * ***************************************
 * The For-Each Style for Loop:
 *  A for-each loop cycles through a collection of objects, such as an array,
 * in strictly sequential fashion, from start to finish. The General form:
 *      for(type itr-var : collection) statement-block
 */


// Use for-each style for on a two-dimensional array.
class ForEach_2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        // Use for-each for loop to display and sum the values.
        for (int[] x :
                nums) {
            for (int y :
                    x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}

/* ***************************************
 * Run:
 *      Value is: 1
 *      Value is: 2
 *      Value is: 3
 *      Value is: 4
 *      Value is: 5
 *      Value is: 2
 *      Value is: 4
 *      Value is: 6
 *      Value is: 8
 *      Value is: 10
 *      Value is: 3
 *      Value is: 6
 *      Value is: 9
 *      Value is: 12
 *      Value is: 15
 *      Summation: 90
 *
 * ***************************************
 * Iteration Over Multidimensional Arrays:
 *  Remember, however, that in Java, multidimensional arrays consist of arrays of
 * arrays.(For example, a two-dimensional array is an array of one-dimensional arrays.)
 * This is important when iterating over a multidimensional array because each
 * iteration obtains the next array, not an individual element.
 *
 *  In the program, pay special attention to this line:
 *      for(int x[] : nums) {
 */