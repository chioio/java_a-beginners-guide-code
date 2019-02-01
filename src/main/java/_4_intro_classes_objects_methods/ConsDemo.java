package _4_intro_classes_objects_methods;
// A simple constructor.
class MyClass {
    int x;

    MyClass() {
        x = 10;
    }

    MyClass(int i) {
        x = i;
    }
}

class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}

/* ***************************************
 * Run:
 *      10 10
 * ***************************************
 * Constructors:
 * -- A constructor initializes an object when it is created. All classes have
 * constructors, whether you define one or not, because Java automatically
 * provides a default constructor.
 *  In this case, non-initialized member variables have their default values,
 * which are:
 *              zero            'null'     and  'false',
 *     for numeric types, reference types, and 'booleans'.
 *
 *  It has the same name as its class and is syntactically similar to a method.
 * However, constructors have no explicit return type. Typically, you will use a
 * constructor to give initial values to the instance variables defined by the
 * class, or to perform any other startup procedures required to create a fully
 * formed object.
 */