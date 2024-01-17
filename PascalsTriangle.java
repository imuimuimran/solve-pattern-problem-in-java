import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int Rows = scanner.nextInt();

        /*
        The pattern looks like the below:
            1 
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
        */ 

        for (int i = 0; i < Rows; i++) {
            for (int space = 0; space < Rows - i - 1; space++) {
                System.out.print(" ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }

        scanner.close();
    }
}
