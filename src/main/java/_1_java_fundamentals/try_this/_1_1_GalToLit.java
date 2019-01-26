package _1_java_fundamentals.try_this;
/*
 * Try This 1-1
 * This program converts gallons to liters
 *      3.7854L = 1G
 *
 * Call this program _1_1_GalToLit.java
 */
public class _1_1_GalToLit {
    public static void main(String[] args) {
        double gallons;     // holds the number of gallons
        double liters;      // holds conversion to liters

        gallons = 10;       // start with 10 gallons

        liters = gallons * 3.7854;      // convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}

/* ***************************************
 * Run in terminal:
 *      javac _1_1_GalToLit.java     (compile)
 *      java _1_1_GalToLit           (run)
 *
 *      10.0 gallons is 37.854 liters.
 *
 * ***************************************
 */