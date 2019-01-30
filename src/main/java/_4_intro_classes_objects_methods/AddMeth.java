package _4_intro_classes_objects_methods;

class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers +
                ". ");
        minivan.range_1();    // display range of minivan
        System.out.print("Sportscar can carry " + sportscar.passengers +
                ". ");
        sportscar.range_1();  // display range of sportscar
    }
}

/* ***************************************
 * Run:
 *      Minivan can carry 7. Range is 336
 *      Sportscar can carry 2. Range is 168
 *
 * ***************************************
 * Method:
 *  general form of a method:
 *      ret-type name (parameter-list) {
 *          // body of method
 *      }
 *  Here, ret-type specifies the type of data returned by the method. This can be
 * any valid type, including class types that you create. if the method does not
 * return a value, tis return type must be 'void'.
 *  The parameter-list is a sequence of type and identifier pairs separated by commas.
 * If the method has no parameters, the parameter list will be empty.
 */