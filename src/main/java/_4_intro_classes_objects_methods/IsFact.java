package _4_intro_classes_objects_methods;

class Factor {
    boolean isFator(int a, int b) {
//        if ((b % a) == 0) return true;
//        else return false;
        return (b % a) == 0;
    }
}

class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFator(2, 20)) System.out.println("2 is factor.");
        if (x.isFator(3, 20)) System.out.println("this won't be displayed");
    }
}

/* ***************************************
 * Run:
 *      2 is factor.
 *
 * ***************************************
 *  Notice that when 'isFactor()' is called, the arguments are also separated by
 * commas.
 */