import java.util.Scanner;

public class ArithhmetischeOperationen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 5;
        int b = 5;

        System.out.println("Bitte geben Sie eine Zahl ein: ");
         a = sc.nextInt();
        System.out.println("Bitte geben Sie noch eine Zahl ein: ");
         b = sc.nextInt();

        System.out.println("Nummer 1 " + a +  ", Nummer 2 " + b);
        System.out.println("Nummer 1 + Nummer 2 = " + (a+b));
        System.out.println("Nummer 1 - Nummer 2 = " + (a-b));
        System.out.println("Nummer 1 * Nummer 2 = " + (a*b));
        System.out.println("Nummer 1 / Nummer 2 = " + (a/b));
        System.out.println("Nummer 1 % Nummer 2 = " + (a%b));

    }
}
