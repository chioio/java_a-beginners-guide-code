package _5_more_datatype_and_operators;

// Some String operations.
class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;

        System.out.println("Length of str1: " +
                str1.length());

        // display str1, one char at a time.
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 equals str2");
        else
            System.out.println("str1 does not equal str2");

        if (str1.equals(str3))
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 and str3 are equal");
        else if (result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        // assign a new string to str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");

        System.out.println("Index of first occurrence of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurrence of One: " + idx);
    }
}

/* ***************************************
 * Run:
 *      Length of str1: 45
 *      When it comes to Web programming, Java is #1.
 *      str1 equals str2
 *      str1 does not equal str3
 *      str1 is greater than str3
 *      Index of first occurrence of One: 0
 *      Index of last occurrence of One: 14
 *
 * ***************************************
 * Operating on Strings:
 *  The 'String' class contains several methods that operate on strings.
 *  Here are the general forms for a few:
 *      boolean equals(str)     |   Returns true if the invoking(调用) string contains the same character sequence as str.
 *      int length()            |   Obtains the length of a string.
 *      char charAt(index)      |   Obtains the character at the index specified by index.
 *      int compareTo(str)      |   Returns less than zero if the invoking string is less than str, greater than zero
 *                                  if the invoking string is greater than str, and zero if the strings are equal.
 *      int indexOf(str)        |   Searches the invoking string for the substring specified by str. Returns the index
 *                                  of the first match or -1 on failure.
 *      int lastIndexOf(str)    |   Searches the invoking string for the substring specified by str. Returns the index
 *                                  of the last match or -1 on failure.
 *
 *  You can concatenate (join together) two strings using the '+' operator.
 * For example, this statement:
 *      String str1 = "One";
 *      String str2 = "Two";
 *      String str3 = "Three";
 *      String str4 = str1 + str2 + str3;
 */