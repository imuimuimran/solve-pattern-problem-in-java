import java.util.Scanner;  
public class BinaryTriangle  {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        int num = 1;
        
        /*
        The pattern looks like the below:
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }  
}  