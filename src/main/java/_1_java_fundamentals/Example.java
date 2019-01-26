package _1_java_fundamentals;

/*
 * This is a simple Java program.
 *
 * Call this file Example.java.
 */
class Example {
    // A Java program begins with a call to main().
    public static void main(String[] args) {
        System.out.println("Java divers the Web.");
    }
}

/* ***************************************
 * Run:
 *      Java divers the Web.
 *
 * ***************************************
 * Follow these three steps:
 * 1.Enter the program.
 * 2.Compile the program. (Command-line: javac Example.java)
 * 3.Run the program.
 *
 * Access Modifier:
 *   public   protected   (default)   private
 *
 * Java application begin execution by calling main().
 * - 'main()' must be declared as 'public', since it must be called by code outside of
 *   its class when the program is started.
 * - The key word 'static' allows 'main()' to be called before an object of the class
 *   has been created. This is necessary because 'main()' is called by the JVM before
 *   any object are made.
 * - The key word 'void' simply tells the compiler that 'main()' does not return a value.
 * - In 'main()' there is only one parameter, 'String args[], which declares a parameter
 *   named 'args'. This is an array of objects of type 'String'.(Arrays are collections
 *   of similar objects.)
 * - Java is case sensitive.
 */