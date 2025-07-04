import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Day: ");
        int Day = scanner.nextInt();

                //  if (Day == 1) 
		        //     System.out.println("Sunday");
		        //     else if (Day == 2) 
		        //     System.out.println("monday");
		        //     else if (Day == 3) 
		        //     System.out.println("Tuesday");
		        //     else if (Day == 4) 
		        //     System.out.println("Wednesday");
		        //     else if (Day == 5) 
		        //     System.out.println("Thursday");
		        //     else if (Day == 6) 
		        //     System.out.println("Friday");
		        //     else if (Day == 7) 
		        //     System.out.println("Saturday");
		        //     else
		        //     System.out.println("Then after no days");
       
    
    
                   if (Day >= 1 && Day <= 5) 
		            System.out.println("Weekday");
		            else if (Day == 6 || Day == 7) 
		            System.out.println("Weekend");
    
            }
}