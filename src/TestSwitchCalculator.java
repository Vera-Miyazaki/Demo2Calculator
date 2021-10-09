import java.util.Scanner;

public class TestSwitchCalculator {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a);

        char c1 = '+';
        char c2 = '-';

        c1 = (char) scanner.nextByte();

        int calculator = 1;
        switch (calculator) {
            case 1:
                System.out.println(a+b);
        }
    }
}
