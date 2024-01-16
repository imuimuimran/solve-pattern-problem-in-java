import java.util.Scanner;  
public class RectangleHollowPattern  {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        System.out.print("Enter the number of column: ");  
        int column = scanner.nextInt();     
        
        /*
        The pattern looks like the below:
        *****
        *   *
        *   *
        ***** 
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= column; j++) {
                if(i == 1 || j == 1 || i == row || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }  
}  