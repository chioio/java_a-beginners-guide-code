package _4_intro_classes_objects_methods;

// This program creates two  Vehicle objects.
// Use a return value.

// This class declares an object of type Vehicle.
class TwoVehicles {
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

        // compute the range assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range1);
        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with a range of " + range2);
    }
}

/* ***************************************
 * Run:
 *      Minivan can carry 7 with a range of 336
 *      Sportscar can carry 2 with a range of 168
 *
 * ***************************************
 *  The 'new' operator dynamically allocates(分配)(that is, allocates at run time)
 * memory for an object and returns a reference to it.This reference is, essentially,
 * the address in memory of the object allocated by 'new'.
 *  Thus, in Java, all class objects must be dynamically allocated.
 */