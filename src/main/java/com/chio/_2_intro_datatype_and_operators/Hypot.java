package com.chio._2_intro_datatype_and_operators;

/*
 * Use the Pythagorean theorem to
 * find the length of the hypotenuse
 * given the length of the two opposing
 * sides.
 *
 * Call this file Hypot.java
 */
class Hypot {
    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);
        System.out.println("Hypotenuse is " + z);
    }
}
