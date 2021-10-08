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

        String st1 = new String("Hier könnte Ihre Werbung stehen");
        String st2 = new String("Hier könnte Ihre Werbung stehen");
       //st1==st2 ist FALSCH

        while (a <1000) {
            System.out.println("a ist " + a);a++;}

        printResult(2+3);
        int result =add(3,9);
        printResult(result);
        printResult(add(8,22));
        printResult(substract(9,6));
        printResult(multiplicate(5,8));
        printResult(divide(4,2));
        printResult(modulo(10,5));

    }

    public static void printResult(int result) {
        System.out.println(result);

    }

    public static int add(int x, int y) {
        return x+y;

    }
    public static int substract(int x, int y) {
        return x - y;
    }
    public static int multiplicate(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static int modulo(int x, int y) {
        return x % y;
    }

}
