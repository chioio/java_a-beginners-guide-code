package _2_intro_datatype_and_operators;

// Demonstrate dynamic initialization.
class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // dynamically initialize volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}

/* ***************************************
 * Run:
 *      Volume is 251.328
 *
 * ***************************************
 */