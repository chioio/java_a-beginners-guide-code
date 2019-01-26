package _2_intro_datatype_and_operators.try_this;

/*
 * Try This 2-1
 * Compute the distance to a lighting
 * strike whose sound takes 7.2 seconds
 * to reach you.
 *
 * Sound travels approximately 1100 feet per second.
 */
class _2_1_Sound {
    public static void main(String[] args) {
        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lightning is " + dist + " feet away.");
    }
}

/* ***************************************
 * Run:
 *      The lightning is 7920.0 feet away.
 *
 * ***************************************
 */