import java.util.Scanner;  
public class InvertedHalfPiramidPattern  {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:
        *****
        ****
        ***
        **
        *
        */ 
        
        for(int i = row; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}  