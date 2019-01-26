package _2_intro_datatype_and_operators;

// Using a cast.
class UseCast {
    public static void main(String[] args) {
        int i;

        for (i = 0; i< 5; i++) {
            System.out.println(i + " / 3: " + 1 / 3);
            System.out.println(i + " / 3 with fractions: " + (double) i / 3);

            System.out.println();
        }
    }
}

/* ***************************************
 * Run:
 *      0 / 3: 0
 *      0 / 3 with fractions: 0.0
 *
 *      1 / 3: 0
 *      1 / 3 with fractions: 0.3333333333333333
 *
 *      2 / 3: 0
 *      2 / 3 with fractions: 0.6666666666666666
 *
 *      3 / 3: 0
 *      3 / 3 with fractions: 1.0
 *
 *      4 / 3: 0
 *      4 / 3 with fractions: 1.3333333333333333
 *
 *
 * ***************************************
 */