package com.chio._2_intro_datatype_and_operators;

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
