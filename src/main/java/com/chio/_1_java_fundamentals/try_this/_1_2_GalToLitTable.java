package com.chio._1_java_fundamentals.try_this;

/*
 * Try This 1-2
 * This program displays a conversion
 * table of gallons to liters.
 *
 * Call this program "galToLitTable.java".
 */
class _1_2_GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;      // convert to liters
            System.out.println(gallons + " gallons is " +
                    liters + " liters.");

            counter++;
            // every 10th line, print a line
            if (counter == 10) {
                System.out.println();
                counter = 0;    // reset the line counter
            }
        }
    }
}

/* ***************************************
 * Run:
 *      1.0 gallons is 3.7854 liters.
 *      2.0 gallons is 7.5708 liters.
 *      3.0 gallons is 11.356200000000001 liters.
 *      4.0 gallons is 15.1416 liters.
 *      5.0 gallons is 18.927 liters.
 *      6.0 gallons is 22.712400000000002 liters.
 *      7.0 gallons is 26.4978 liters.
 *      8.0 gallons is 30.2832 liters.
 *      9.0 gallons is 34.0686 liters.
 *      10.0 gallons is 37.854 liters.
 *
 *      11.0 gallons is 41.6394 liters.
 *      12.0 gallons is 45.424800000000005 liters.
 *      13.0 gallons is 49.2102 liters.
 *      14.0 gallons is 52.9956 liters.
 *      15.0 gallons is 56.781 liters.
 *      16.0 gallons is 60.5664 liters.
 *      17.0 gallons is 64.3518 liters.
 *      18.0 gallons is 68.1372 liters.
 *      19.0 gallons is 71.9226 liters.
 *      20.0 gallons is 75.708 liters.
 *
 *      21.0 gallons is 79.49340000000001 liters.
 *      ...
 *
 * ***************************************
 */
