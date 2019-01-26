package _1_java_fundamentals;

/*
 * This program illustrates(说明;演示) the differences
 * between int and double.
 *
 * Call this file Example3.java
 */
class Example3 {
    public static void main(String[] args) {
        int var;    // this declares an int variable
        double x;   // this declares a floating-point variable

        var = 10;   // assign var the value 10
        x = 10.0;   // assign x the value 10.0

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println();   // print a blank line

        // now, divide both by 4
        var = var / 4;
        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}

/* ***************************************
 * Run:
 *      Original value of var: 10
 *      Original value of x: 10.0
 *
 *      var after division: 2
 *      x after division: 2.5
 * ***************************************
 *   Java defines two floating-point types: 'float' and 'double', which represent
 * single- and double-precision(单/双精度) values, respectively(分别).
 *   To declare a variable of type 'double':
 *      double x;
 */