package _5_more_datatype_and_operators;

// Introduce String.
class StringDemo {
    public static void main(String[] args) {
        // declare strings in various ways
        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

/* ***************************************
 * Run:
 *      Java strings are objects.
 *      They are constructed various ways.
 *      They are constructed various ways.
 *
 * ***************************************
 * String:
 *  'String' defines and supports character strings. In some other programming
 * languages, a string is an array of characters. This is not the case with Java.
 * In Java, strings are objects.
 * Constructing Strings:
 *  You can construct a 'String' just like you construct any other type of object:
 * by using 'new' and calling the 'String' constructor. For example:
 *      String str = new String("Hello");
 */