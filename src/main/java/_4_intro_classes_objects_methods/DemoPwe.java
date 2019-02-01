package _4_intro_classes_objects_methods;

class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
//        b = base;
//        e = exp;
        this.b = base;
        this.e = exp;

//        val = 1;
        this.val = 1;
        if (exp == 0) return;
//        for (; exp > 0; exp--) val = val * base;
        for ( ; exp > 0; exp--) this.val = this.val * base;
    }

    double get_pwr() {
//        return val;
        return this.val;
    }
}

class DemoPwe {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0 ,2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e +
                " poser is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e +
                " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e +
                " power is " + z.get_pwr());
    }
}

/* ***************************************
 * Run:
 *      4.0 raised to the 2 poser is 16.0
 *      2.5 raised to the 1 power is 2.5
 *      5.7 raised to the 0 power is 1.0
 *
 * ***************************************
 * The this Keyword
 *  When a method is called, it is automatically passed an implicit(隐式的) argument
 * that is a reference to the invoking(引用；援引) object (that is, the object on
 * which the method is called). This reference is called 'this'.
 */