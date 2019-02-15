package _5_more_datatype_and_operators;

// Use a string to control a switch statement.
class StringSwitch {
    public static void main(String[] args) {

        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
            default:
                System.out.println("Command Error!");
                break;
        }
    }
}

/* ***************************************
 * Run:
 *      Canceling
 *
 * ***************************************
 * Using a String to Control a switch Statement:
 *  Prior to JDK 7, a 'switch' had to be controlled by an integer type, such as
 * 'int' or 'char'. This precluded the use of a 'switch' in situations in which
 * one of several actions is selected based on the contents of string.
 *  Instead, an 'if-else-if' ladder was the typical solution. Although an 'if-else-if'
 * ladder is semantically correct, a 'switch statement would be the more natural
 * idiom(方言；行话) for such a selection. Fortunately, this situation has been
 * remedied(补偿；弥补；纠正). Today, you can use a 'String' to control a switch.
 *  Don't use strings in a 'switch' unnecessarily.
 */