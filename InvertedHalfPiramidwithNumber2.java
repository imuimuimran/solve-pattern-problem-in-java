import java.util.Scanner;  
public class InvertedHalfPiramidwithNumber2 {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:
        11111
        2222
        333
        44
        5
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row -i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }  
}  