package _3_program_control_statements;

// Demonstrate the switch
class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is five or more");
            }
    }
}

/* ***************************************
 * Run:
 *      i is zero
 *      i is one
 *      i is two
 *      i is three
 *      i is four
 *      i is five or more
 *      i is five or more
 *      i is five or more
 *      i is five or more
 *      i is five or more
 *
 * ***************************************
 * The switch Statement:
 *  The 'switch' provides for a multi-way(多路) branch. It works like this: the
 * value of an expression is successively tested against a list of constants.
 *  The general form of the 'switch' statement is:
 *      switch (expression) {
 *      case constant1:
 *          statement sequence
 *          break;
 *      case constant2:
 *          statement sequence
 *          break;
 *      case constant3:
 *          statement sequence
 *          break;
 *      ...
 *      default:
 *          statement sequence
 *      }
 *  Each value specified in the 'case' statements must be a unique constant
 * expression (such as a literal value). Duplicate 'case' values are not
 * allowed.
 *  The 'default' statement sequence is executed if no 'case' constant matches
 * the expression. The default is optional; if it is not present, no action
 * takes place if all matches fail.
 *  When a match is found, the statements associated with that 'case' are
 *  executed until the 'break' is encountered(遇到) or, in the case of 'default'
 * or the lase case, until the end of the 'switch' is reached.
 *  Technically, the 'break' statement is optional, although most application of
 * the 'switch' will use it. The 'break' statement causes program flow to exit
 * from the entire 'switch' statement and resume at the next statement outside
 * the 'switch'. However, if a 'break' statement does not end the statement sequence
 * associated with a 'case', then all the statements at and following the matching
 * 'case' will be executed until a 'break'(or the end of the 'switch') is encountered.
 */