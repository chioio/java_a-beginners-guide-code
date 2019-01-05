package com.chio._1_java_fundamentals;

/*
 * Demonstrate a block of code.
 *
 * Call this file BlockDemo.java.
 */
class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target of this if is a block
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j/i is " + d);
        }
    }
}

/* ***************************************
 * Run:
 *      i does not equal zero
 *      j/i is 2.0
 *
 * ***************************************
 * Create Blocks of Code:
 *   A code block is a grouping of two or more statements. For example, a block
 * can be a target for Java's 'if' and 'for' statements.
 *
 * Semicolons and Positioning
 *   In Java, the semicolon is a separator. It is often used to terminate a statement.
 * In essence, the semicolon indicates the end of one logical entity.
 */
