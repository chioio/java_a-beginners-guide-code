package _5_more_datatype_and_operators;

// Use XOR to encode and decode a message.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}

/* ***************************************
 * Run:
 *      Original message: This is a test
 *      Encoded message: 01+x1+x9x,=+,
 *      Decoded message: This is a test
 *
 * ***************************************
 *  An exclusive OR, usually abbreviated(缩写) XOR, will result in a set bit if,
 * and only if, the bits being compared are different, as illustrated here:
 *          0 1 1 1 1 1 1 1
 *       ^  1 0 1 1 1 0 0 1
 *       ------------------
 *          1 1 0 0 0 1 1 0
 *  The XOR operator has an interesting property that makes it a simple way to
 * encode a message. When some value X is XORed with another value Y, and then
 * that result is XORed with Y again, X is produced. That is, given the sequence
 *      R1 = X ^ Y; R2 = R1 ^ Y;
 * then R2 is the same value as X. Thus, the outcome of a sequence of two XORs
 * can produce the original value.
 */