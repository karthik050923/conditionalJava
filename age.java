public class age {
    public static void main(String[] args) {
        int age = 12;
            if (age <= 3) {
            System.out.println("Free admission");
        } else if (age > 4 && age <= 12) {
            System.out.println("Child ticket is : $10");
        }else if (age > 14 && age <= 64) {
	            System.out.println("Adult ticket is : $30");
	        }else if (age > 65 && age <= 70) {
	            System.out.println("child ticket is : $30");
	        }else {
               System.out.println("Invalid"); 
            }
    }
    }

