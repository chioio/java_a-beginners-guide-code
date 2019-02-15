package _5_more_datatype_and_operators;

// Demonstrate an array overrun.
class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;
        // generate an array overrun
        for (i = 0; i< 100; i= i+1)
            sample[i] = i;
    }
}

/* ***************************************
 * Run:
 *      Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
 *      	at _5_more_datatype_and_operators.ArrayErr.main(ArrayErr.java:10)
 *
 * ***************************************
 *  Array boundaries are strictly enforced in Java; it is a run-time error to
 * overrun or underrun the end of an array.
 */