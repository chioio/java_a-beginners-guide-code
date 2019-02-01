package _4_intro_classes_objects_methods;

// A parameterized constructor
class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}

/* ***************************************
 * Run:
 *      10 88
 *
 * ***************************************
 * Parameterized Constructors:
 *  Parameter are added to a constructor in the same way that they are added to a
 * method: just declare them inside the parentheses after the constructor's name.
 */