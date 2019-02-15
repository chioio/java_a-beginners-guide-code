package _5_more_datatype_and_operators;

// Demonstrate a one-dimensional array.
class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int [10];
        int i;

        for (i = 0; i < 10; i = i+1)
            sample[i] = i;

        for (i = 0; i < 10; i = i+ 1)
            System.out.println("This is sample [" + i + "] : " +
                    sample[i]);
    }
}

/* ***************************************
 * Run:
 *      This is sample [0] : 0
 *      This is sample [1] : 1
 *      This is sample [2] : 2
 *      This is sample [3] : 3
 *      This is sample [4] : 4
 *      This is sample [5] : 5
 *      This is sample [6] : 6
 *      This is sample [7] : 7
 *      This is sample [8] : 8
 *      This is sample [9] : 9
 *
 * ***************************************
 * Arrays:
 *  An array is a collection of variables of the same type, referred to by a
 * common name. In Java, arrays can have one or more dimensions, although the
 * one-dimensional array is the most common.
 *
 * One-Dimensional Arrays:
 *  A one-dimensional array is a list of related variables.
 *  General form:
 *      type array-name[] = new type[size];
 *
 */