package _5_more_datatype_and_operators;

// Use the length array member.
class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = { // a variable-length table
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("length of list is " + list.length);
        System.out.println("length of nums is " + nums.length);
        System.out.println("length of table is " + table.length);
        System.out.println("length of table[0] is " + table[0].length);
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);
        System.out.println();

        // use length to initialize list
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("Here is list: ");
        // now use length to display list
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        System.out.print("Here is list: ");
        // use for-each statement to display list
        for (int i1 : list) System.out.print(i1 + " ");
        System.out.println();
    }
}

/* ***************************************
 * Run:
 *      length of list is 10
 *      length of nums is 3
 *      length of table is 3
 *      length of table[0] is 3
 *      length of table[1] is 2
 *      length of table[2] is 4
 *
 *      Here is list: 0 1 4 9 16 25 36 49 64 81
 *      Here is list: 0 1 4 9 16 25 36 49 64 81
 *
 * ***************************************
 * Using the length Member:
 *  Because arrays are implemented as objects, each array has associated with it
 * a 'length' instance variable that contains the number of elements that the
 * array can hold.(In other words,'length' contains the size of the array.)
 *  A two-dimensional array is an array of arrays.
 */