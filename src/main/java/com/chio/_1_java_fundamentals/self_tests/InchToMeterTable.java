package com.chio._1_java_fundamentals.self_tests;

/*
 * This program displays a conversion
 * table of inches to meters.
 *
 * Call this program InchToMeterTable.java.
 */
class InchToMeterTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;        // convert to meters
            System.out.println(inches + " inches is " +
                    meters + " meters.");

            counter++;
            // every 12th line, print a blank line
            if (counter == 12) {
                System.out.println();
                counter = 0;    // reset the line counter
            }
        }
    }
}

/* ***************************************
 * Run:
 *      1.0 inches is 0.025400050800101603 meters.
 *      2.0 inches is 0.05080010160020321 meters.
 *      3.0 inches is 0.07620015240030481 meters.
 *      4.0 inches is 0.10160020320040641 meters.
 *      5.0 inches is 0.12700025400050802 meters.
 *      6.0 inches is 0.15240030480060962 meters.
 *      7.0 inches is 0.17780035560071122 meters.
 *      8.0 inches is 0.20320040640081283 meters.
 *      9.0 inches is 0.2286004572009144 meters.
 *      10.0 inches is 0.25400050800101603 meters.
 *      11.0 inches is 0.27940055880111764 meters.
 *      12.0 inches is 0.30480060960121924 meters.
 *
 *      13.0 inches is 0.33020066040132084 meters.
 *      14.0 inches is 0.35560071120142245 meters.
 *      15.0 inches is 0.38100076200152405 meters.
 *      ...
 *      141.0 inches is 3.581407162814326 meters.
 *      142.0 inches is 3.6068072136144274 meters.
 *      143.0 inches is 3.632207264414529 meters.
 *      144.0 inches is 3.6576073152146305 meters.
 *
 * ***************************************
 */
