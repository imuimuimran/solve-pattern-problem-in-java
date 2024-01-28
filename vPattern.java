import java.util.Scanner;  
public class vPattern {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:

        *    *
         *  *
           *
        */ 
        
        int i, j;

        //V pattern
        for (i = row; i >= 1; i--) {
            for (j = i; j < row; j++) {
                System.out.print(" ");//print spaces
            }

            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) //Logic for printing star
                    System.out.print("*");
                else
                System.out.print(" ");//if logic fails print space
            }
            System.out.println("");

        }

        scanner.close();
    }  
}  