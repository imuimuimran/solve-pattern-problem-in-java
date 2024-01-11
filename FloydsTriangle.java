import java.util.Scanner;  
public class FloydsTriangle  {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        int num = 1;
        
        /*
        The pattern looks like the below:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }  
}  