import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Row : ");
        int row = input.nextInt();

        System.out.print("Column : ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("["+i+"]["+j+"]. Element = ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix : ");
        for(int i[] : matrix){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("\nTranspose : ");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
