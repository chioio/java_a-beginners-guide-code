package _5_more_datatype_and_operators.try_this;

/*
 * Try This 5-2
 *
 * A queue class for characters.
 */
class Queue {
    char q[];   // this array holds the queue
    int putloc, getloc;     // the put and get indices

    public Queue(int size) {
        q = new char[size];     // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into hte queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue class.
class _5_2_QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers int bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve(检索) and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch + " ");
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch + " ");
        }
    }
}

/* ***************************************
 * Run:
 *      Using bigQ to store the alphabet.
 *      Contents of bigQ: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 *
 *      Using smallQ to generate errors.
 *      Attempting to store Z
 *      Attempting to store Y
 *      Attempting to store X
 *      Attempting to store W
 *      Attempting to store V - Queue is full.
 *
 *
 *      Contents of smallQ: Z Y X W  - Queue is empty.
 *
 * ***************************************
 */