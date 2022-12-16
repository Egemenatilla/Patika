import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row,col;
        System.out.print("Enter the Number of Row: ");
        row = input.nextInt();
        System.out.print("Enter the Number of Column");
        col = input.nextInt();

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();

    }

}
