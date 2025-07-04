import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = scanner.nextInt();

        if (Number >= 0 && Number <= 10) {
            System.out.println("positive");
        } else if (Number <= -1 && Number >= -10) {
            System.out.println("Negative");
        }
    }
}    
