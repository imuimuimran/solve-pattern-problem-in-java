import java.util.Scanner;  
public class InvertedHalfPiramidwithNumber  {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row -i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }  
}  