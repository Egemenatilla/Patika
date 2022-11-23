import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = input.nextInt();

        for (int i = number; i >= 1; i--)
        {
            for (int j = 0; j < number - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
