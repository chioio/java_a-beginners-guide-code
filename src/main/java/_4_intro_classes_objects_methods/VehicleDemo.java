package _4_intro_classes_objects_methods;

/*
 * A program that uses the VehicleDemo class.
 *
 * Call this file VehicleDemo.java
 */
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel(燃料) capacity(容量) in gallons
    int mpg;        // fuel consumption(消耗量) in miles per gallon

    // Add a constructor.
    Vehicle() {
    }

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Add range to Vehicle.
    // Display the range.
    void range_1() {
        System.out.println("Range is " + fuelcap * mpg);
    }

    // Return the range
    int range_2() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

// This class declares an object of type Vehicle.
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();    // create a Vehicle object called minivan
        int range;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range);
    }
}

/* ***************************************
 * Run:
 *      Minivan can carry 7 with a range of 336
 *
 * ***************************************
 * Create Objects:
 *  Each time you create an instance of a class, you are creating an object that
 * contains its own copy of each instance variable defined by the class.
 *  To access these variable, you will use the dot(.) operator. The dot operator
 * links the name of an object with the name of a member. The general form of the
 * dot operator:
 *      object.member
 *
 * -- You should call the file that contains this program 'VehicleDemo.java' because
 * the 'main()' method is in the class called 'VehicleDemo', not the class called
 * 'Vehicle'.
 *  When you compile this program, you will find that two '.class' files have been
 * created, one for 'Vehicle' and one for 'VehicleDemo'.
 */