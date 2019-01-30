package _4_intro_classes_objects_methods;

class RetMeth {
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

        // get the ranges
        range1 = minivan.range_2();
        range2 = sportscar.range_2();

        System.out.println("minivan can carry " + minivan.passengers +
                " with range of " + range1 + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with range of " + range2 + " miles");
    }
}

/* ***************************************
 * Run:
 *      minivan can carry 7 with range of 336 miles
 *      Sportscar can carry 2 with range of 168 miles
 *
 * ***************************************
 */