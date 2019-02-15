package _5_more_datatype_and_operators;

// Use substring().
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the web move.";

        // construct a substring
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}

/* ***************************************
 * Run:
 *      orgstr: Java makes the web move.
 *      substr: makes the web
 *
 * ***************************************
 * Strings Are Immutable:
 *  The contents of a 'String' object are immutable(不可更改的). That is, once
 * created, the character sequence that makes up the string cannot be altered.
 * This restriction(限制) allows Java to implement strings more efficiently.
 * Even though this probably sounds like a serious drawback(缺点), it isn't.
 * When you need a string that is a variation on one that already exists, simply
 * create a new string that contains the desired changes. Since unused 'String'
 * objects are automatically garbage collected, you don't even need to worry
 * about what happens to the discarded(丢弃的) strings. It must be made clear,
 * however, that 'String' reference variables may, of course, change the object
 * to which they refer. It is just that the contents of a specific 'String' object
 * cannot be changed after it is created.
 */