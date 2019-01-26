package _2_intro_datatype_and_operators;

// Demonstrate automatic conversion from long to double.
class LtoD_1 {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;      // Automatic conversion from 'long' to 'double'

        System.out.println("L and D: " + L + " " + D);
    }
}

/* ***************************************
 * Run:
 *      L and D: 100123285 1.00123285E8
 *
 * ***************************************
 */



// *** This program will not compile. ***
class LtoD_2 {
    public static void main(String[] args) {
        long L;
        double D;

        D = 100123285.0;
//        L = D;    // Illegal!!! No automatic conversion from 'double' to 'long'

//        System.out.println("L and D: " + L + " " + D);
    }
}