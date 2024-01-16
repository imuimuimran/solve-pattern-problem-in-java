import java.util.Scanner;  
public class ButterflyPattern {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

        */ 
        // Upper Half
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                    System.out.print("*");
            }

            int spaces = 2 * (row - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Lower Half
        for(int i = row; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                    System.out.print("*");
            }

            int spaces = 2 * (row - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }  
}  