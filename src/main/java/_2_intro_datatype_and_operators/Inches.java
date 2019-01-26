package _2_intro_datatype_and_operators;

/*
 * Compute the number of cubic inches in 1 cubic mile.
 */
public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");
    }
}

/* ***************************************
 * Run:
 *      There are 254358061056000 cubic inches in cubic mile.
 *
 * ***************************************
 * Java's Primitive Types:
 *  Java contains two general categories of built-in data types: object-oriented and
 * non-object-oriented.
 *
 *  These primitive types are not objects because of efficiency concerns.
 *  Java's Built-in Primitive Data Types:
 *      Type                Meaning
 *      boolean     |   Represents true/false values
 *      byte        |   8-bit integer
 *      char        |   Character
 *      double      |   Double-precision floating point
 *      float       |   Single precision floating point
 *      int         |   Integer
 *      long        |   Long integer
 *      short       |   Short integer
 *  Java strictly specifies a range and behavior for each primitive type, which all
 * implementations of the Java Virtual Machine must support.
 *
 * Integer:
 *  Java defines four integer types: 'byte', 'short', 'int', and 'long'
 *      Type        Width in Bits       Range
 *      byte    |   8               (2^8) -128 to 127
 *      short   |   16              (2^16) -32768 to 32767
 *      int     |   32              (2^32) -2147483648 to 2147483647
 *      long    |   64              (2^64) -9223372036854775808 to 9223372036854775807
 *
 */