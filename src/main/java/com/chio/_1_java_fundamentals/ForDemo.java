package com.chio._1_java_fundamentals;

/*
 * Demonstrate the for loop.
 *
 * Call this file ForDemo.java
 */
class ForDemo {
    public static void main(String[] args) {
        int count;

//        for (count = 0; count < 5; count = count + 1)
        for (count = 0; count < 5; count++)
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}

/* ***************************************
 * Run:
 *      This is count: 0
 *      This is count: 1
 *      This is count: 2
 *      This is count: 3
 *      This is count: 4
 *      Done!
 *
 * ***************************************
 * The for Loop:
 *   The simplest form of the 'for' loop is shown here:
 *      for(initialization; condition; iteration) statement;
 *   'condition' is a Boolean expression that tests the loop control variable. If
 * the outcome of that test is true, statement executes and the 'for' loop continues
 * to iterate(迭代). If it is false, the loop terminates.
 *   The increment operator is '++';
 *   The decrement operator is '--';
 */
