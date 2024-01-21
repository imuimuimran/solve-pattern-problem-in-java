import java.util.Scanner;  
public class DiagonalPAttern {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:

            *
           *
          *
         *
        *

        */ 
        
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 0; j < row - i; j++) {
                System.out.print("  "); //Print blank space
            }
            System.out.println("*"); //Print Star and newline
        }

        scanner.close();
    }  
}  