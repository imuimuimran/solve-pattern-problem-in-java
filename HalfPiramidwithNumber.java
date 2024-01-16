import java.util.Scanner;  
public class HalfPiramidwithNumber  {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }  
}  