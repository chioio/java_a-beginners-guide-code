package com.chio._1_java_fundamentals;

/*
 * Demonstrate the if.
 *
 * Call this file IfDemo.java
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a is less than b");
        // this won't display anything
        if (a == b) System.out.println("you won't see this");

        System.out.println();

        c = a - b;      // c contains -1
        System.out.println("c contains -1");
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");

        System.out.println();

        c = b - a;      // c now contains 1

        System.out.println("c contains 1");
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");
    }
}

/* ***************************************
 * Run:
 *      a is less than b
 *
 *      c contains -1
 *      c is negative
 *
 *      c contains 1
 *      c is non-negative
 *
 * ***************************************
 * The if Statement:
 *   It determines the flow of program execution based on whether some condition is
 * true or false:
 *      if(condition) statement;
 *   Here, condition is a Boolean expression. If condition is true, then the state-
 * ment is executed. If condition is false, then the statement is bypassed.
 *
 * Relational Operators:
 *      Operator    |   Meaning
 *      <           |   Less than
 *      <=          |   Less than or equal
 *      >           |   Greater than
 *      >=          |   Greater than or equal
 *      ==          |   Equal to
 *      !=          |   Not equal
 */
