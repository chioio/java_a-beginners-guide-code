package _4_intro_classes_objects_methods.try_this;

/*
 * Try This 4-1
 *
 * Convert the help system from Try This 3-3 into a Help class.
 */
class Help {
    void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch (expression) {");
                System.out.println("    case constant: ");
                System.out.println("        statement sequence");
                System.out.println("        break");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for: \n");
                System.out.println("for (init; condition; iteration)");
                System.out.println("    statement;");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while (condition) statement;");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("    statement;");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("The break: \n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue: \n");
                System.out.println("continue; or continue label;");
                break;
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Help on: ");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue\n");
        System.out.print("Choose one (q to quit):");
    }

    boolean isValid(int ch) {
//        if (ch < '1' | ch > '7' & ch != 'q') return false;
//        else return true;
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}


class _4_1_HelpClassDemo {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for ( ; ; ) {
            do {
                hlpobj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");
            hlpobj.helpOn(choice);
        }

    }
}

/* ***************************************
 * Run:
 *      Help on:
 *          1. if
 *          2. switch
 *          3. for
 *          4. while
 *          5. do-while
 *          6. break
 *          7. continue
 *
 *      Choose one (q to quit):5
 *
 *
 *      The do-while:
 *
 *      do {
 *          statement;
 *      } while (condition);
 *
 *      Help on:
 *          1. if
 *          2. switch
 *          3. for
 *          4. while
 *          5. do-while
 *          6. break
 *          7. continue
 *
 *      Choose one (q to quit):1
 *
 *
 *      The if:
 *
 *      if (condition) statement;
 *      else statement;
 *
 *      Help on:
 *          1. if
 *          2. switch
 *          3. for
 *          4. while
 *          5. do-while
 *          6. break
 *          7. continue
 *
 *      Choose one (q to quit):q
 *
 * ***************************************
 *  If one were to try to summarize the essence of the class in one sentence, it
 * might be this: a class encapsulates functionality.
 */