package _5_more_datatype_and_operators;

class MinMax {
    static void min_max(int[] nums) {
        int max;
        int min;
        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("min and max: " + min + " " + max);
    }
}

// Find the minimum and maximum values in an array.
class MinMax_1 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        MinMax.min_max(nums);
    }
}

/* ***************************************
 * Run:
 *      min and max: -978 100123
 *
 * ***************************************
 */


// Use array initializers.
class MinMax_2 {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};

        MinMax.min_max(nums);
    }
}

/* ***************************************
 * Run:
 *      min and max: -978 100123
 *
 * ***************************************
 */
