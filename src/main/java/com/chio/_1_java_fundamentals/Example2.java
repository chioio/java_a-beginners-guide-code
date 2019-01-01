package com.chio._1_java_fundamentals;

/*
 * This demonstrates(演示) a variable.
 * Call this file Example2.java.
 */
class Example2 {
    public static void main(String[] args) {
        int var1;   // this declares a variable
        int var2;   // this declares another variable

        var1 = 1024;    // this assigns 1024 to var1
        System.out.println("var1 contains " + var1);

        var2 = var1 / 2;
        System.out.print("var2 contains var1 / 2: ");
        System.out.println(var2);
    }
}

/*
 *   In Java, all variables must be declared before they are used,the assignment operator
 * is the single equal sign. It copies the value on its right side into the variable on
 * its left.
 *   To declare a variable you will use a statement like this: type var-name;
 *   Using the '+' operator, you can chain together as many items as you want within a
 * single println() statement.
 *
 */