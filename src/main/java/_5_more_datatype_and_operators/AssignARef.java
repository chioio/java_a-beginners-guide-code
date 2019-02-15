package _5_more_datatype_and_operators;

// Assigning array reference variables.
class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < 10; i++)
            nums1[i] = i;

        for (i = 0; i < 10; i++)
            nums2[i] = -i;

        System.out.print("Here is nums1: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here is nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;  // now nums2 refers to nums1

        System.out.print("Here is nums2 after assignment: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        // now operate on nums1 array through nums2
        nums2[3] = 99;

        System.out.print("Here is nums1 after change through nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}

/* ***************************************
 * Run:
 *      Here is nums1: 0 1 2 3 4 5 6 7 8 9
 *      Here is nums2: 0 -1 -2 -3 -4 -5 -6 -7 -8 -9
 *      Here is nums2 after assignment: 0 1 2 3 4 5 6 7 8 9
 *      Here is nums1 after change through nums2: 0 1 2 99 4 5 6 7 8 9
 *
 * ***************************************
 *  As the output shows, after the assignment of 'nums1' to 'nums2', both array reference
 * variables refer to the same object.
 */