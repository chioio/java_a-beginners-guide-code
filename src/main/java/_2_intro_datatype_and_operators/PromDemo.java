package _2_intro_datatype_and_operators;

// A promotion surprise!
class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;  // OK, no cast needed

        b = 10;
        b = (byte) (b * b);   // cast needed!!

        System.out.println("i and b: " + i + " " + b);
    }
}

/* ***************************************
 * Run:
 *      i and b: 100 100
 *
 * ***************************************
 * No cast needed because result is already elevated to 'int'.
 * Cast is needed here to assign an 'int' to a 'byte'!
 */