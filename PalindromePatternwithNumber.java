import java.util.Scanner;  
public class PalindromePatternwithNumber {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:
           
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row - i; j++) {
                    System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }  
}  