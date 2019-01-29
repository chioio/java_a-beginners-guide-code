package _3_program_control_statements.self_tests;

// Change case.
class CaseChg {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter period to stop.");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.print(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.print(ch);
            } else System.out.print(ch);
        } while (ch != '.');
        System.out.println("\nCase change: " + changes);
    }
}

/* ***************************************
 * Run:
 *      Enter period to stop.
 *      Java Python Golang
 *      jAVA pYTHON gOLANG
 *      Git GitHub . Gitee
 *      gIT gIThUB .
 *      Case change: 25
 *
 * ***************************************
 */