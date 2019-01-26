package _2_intro_datatype_and_operators.self_tests;

// Find prime numbers between 2 and 100.
class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            // see if the number is evenly divisible
            for (j = 2; j <= i/j; j++)
                // if it is, then it's not prime
                if ((i%j) == 0) isprime = false;
                if (isprime)
                    System.out.println(i + " is prime.");
        }
    }
}

/* ***************************************
 * Run:
 *      2 is prime.
 *      3 is prime.
 *      5 is prime.
 *      7 is prime.
 *      11 is prime.
 *      13 is prime.
 *      17 is prime.
 *      19 is prime.
 *      23 is prime.
 *      29 is prime.
 *      31 is prime.
 *      37 is prime.
 *      41 is prime.
 *      43 is prime.
 *      47 is prime.
 *      53 is prime.
 *      59 is prime.
 *      61 is prime.
 *      67 is prime.
 *      71 is prime.
 *      73 is prime.
 *      79 is prime.
 *      83 is prime.
 *      89 is prime.
 *      97 is prime.
 *
 * ***************************************
 * prime(素数；质数): 质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
 */