import java.util.Scanner;

public class CondIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        OddNumber(number);
        scanner.close();
    }

    public static void OddNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("It is an Even Number");
        } else {
            System.out.println("It is an Odd Number");
        }
    }
}
