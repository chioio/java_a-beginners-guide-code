package _2_intro_datatype_and_operators;

// Demonstrate block scope.
class ScopeDemo {
    public static void main(String[] args) {
        int x;  // known to all code within main

        x = 10;
        if (x == 10) {      // start new scope

            int y = 20;     // know only to this block
            // x and y both known here.

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;         // Error! y not known here
        // x is still known here
        System.out.println("x is " + x);
    }
}

/* ***************************************
 * Run:
 *      x and y: 10 20
 *      x is 40
 *
 * ***************************************
 * The Scope and Lifetime of Variables:
 *  Global and Local(全局和局部), but these are not the best ways to categorize
 * Java's scopes.
 *  The most important scopes in Java are those defined by a class and those
 * defined by a method.
 *  As a general rule, variable declared inside a scope are not visible (that
 * is ,accessible) to code that is defined outside that scope. Thus, when you
 * declare a variable within a scope, you are localizing that variable and
 * protecting it from unauthorized(未经授权的) access and/or modification. Indeed,
 * the scope rules provide the foundation for 'encapsulation'.
 *  Scope can be nested. For example, each time you create a block of code, you
 * are creating a new, nested scope. When this occurs, the outer scope encloses
 * the inner scope. The means that objects declared in the outer scope will be
 * visible to code within the inner scope. However, the reverse is not true.
 * Objects declared within the inner scope will not be visible outside it.
 *
 *  ! Here is another important point to remember: variables are crated when their
 * scope is left.
 */
