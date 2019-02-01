package _4_intro_classes_objects_methods;

class VehConsDemo {
    public static void main(String[] args) {

        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 15, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + "miles minivan needs " +
                gallons + " gallons of fuel.");
    }
}

/* ***************************************
 * Run:
 *      To go 252 miles minivan needs 12.0 gallons of fuel.
 *      To go 252miles minivan needs 21.0 gallons of fuel.
 *
 * ***************************************
 * The new Operator:
 *  General form:
 *      class-var = new class-name(arg-list);
 *  Here, class-var is a variable of the class type being created. The class-name
 * is the name of the class that is being instantiated(实例化的). The class name
 * followed by a parenthesized argument list (which can be empty) specifies the
 * constructor for the class.
 *  If a class does not define its own constructor, 'new' will use the default
 * constructor supplied by Java. The 'new' operator returns a reference to the
 * newly created object, which (in this case) is assigned to class-var.
 *  Since memory is finite, it is possible that 'new' will not be able to 'allocate'
 * memory for an object because insufficient(不足的；不全面的；不充分的) memory exists.
 * If this happens, a run-time exception will occur.
 */