import java.util.Scanner;
public class Switch {
//     public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter day number of the week eg: 1-Sunday");
// int day = scan.nextInt();

// switch (day) {
//     case 1  -> System.out.println("Sunday");
//     case 2  -> System.out.println("Monday");
//     case 3  -> System.out.println("Tuesday");
//     case 4  -> System.out.println("Wednesday");
//     case 5  -> System.out.println("Thursday");
//     case 6  -> System.out.println("Friday");
//     case 7  -> System.out.println("Saturday");
// }
// }


    public static void main(String[] args) {
        int dayOfWeek = 2;
        
        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday! ");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's the weekend!");
        }
    }
}


