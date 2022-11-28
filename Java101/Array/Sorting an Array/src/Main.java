import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size,element;
        System.out.println("Enter size of the array: ");
        size = input.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the element ("+i+")");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
