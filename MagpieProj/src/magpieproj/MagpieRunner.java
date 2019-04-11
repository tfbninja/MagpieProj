package MagpieProj;

import java.util.Scanner;

/**
 *
 * @author Elliot and Tim
 */
public class MagpieRunner {

    public static void main(String[] args) {
        Magpie maggie = new Magpie();

        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye")) {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}
