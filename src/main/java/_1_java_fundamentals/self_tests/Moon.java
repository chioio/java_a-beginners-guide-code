package _1_java_fundamentals.self_tests;

/*
 * Compute your weight on the moon.
 *
 * Call this file Moon.java.
 */
class Moon {
    public static void main(String[] args) {
        double earthweight;     // weight on earth
        double moonweight;      // weight on moon

        earthweight = 100;
        moonweight = earthweight * 0.17;

        System.out.println(earthweight + " earth-pounds is equivalent to " +
                moonweight + " moon-pounds.");
    }
}

/* ***************************************
 * Run:
 *      100.0 earth-pounds is equivalent to 17.0 moon-pounds.
 *
 * ***************************************
 */