package _3_program_control_statements;

// Demonstrate nested switch statements
class NestSwitch {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 'A';
        ch2 = 'B';

        switch (ch1) {
            case 'A':
                System.out.println("This A is part of outer switch.");
                switch (ch2) {
                    case 'A':
                        System.out.println("This A is part of inner switch");
                        break;
                    case 'B':
                        System.out.println("This B is part of inner switch");
                }   // end of inner switch
                break;
            case 'B':
                System.out.println("This B is part of outer switch");
        }
    }
}

/* ***************************************
 * Run:
 *      This A is part of outer switch.
 *      This B is part of inner switch
 *
 * ***************************************
 * It is possible to have a 'switch' as part of the statement sequence of an outer
 * 'switch'.
 */