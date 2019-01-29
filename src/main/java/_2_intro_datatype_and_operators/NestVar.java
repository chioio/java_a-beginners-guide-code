package _2_intro_datatype_and_operators;

/*
 * This program attempts to declare a variable
 * int an inner scope with the same name as one
 * defined in an outer scope.
 *
 *    *** This program will not compile. ***
 */
class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);

            // int count;  // illegal!!!
            for (count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}

/* ***************************************
 * Run:
 *      This is count: 3
 *      This program is in error!
 *      This program is in error!
 *      This is count: 3
 *      This program is in error!
 *      ...(Infinite Loop)
 * ***************************************
 */