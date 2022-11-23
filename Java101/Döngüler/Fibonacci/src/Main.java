import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element,fib1 = 1,fib2 = 1,fib;
        System.out.println("Which element do you want calculate?");
        element = input.nextInt();

        for (int i = 1; i< element;i++)
        {
            fib = fib1 +fib2;
            System.out.println(fib1+" + "+fib2+ " = "+fib);
            fib1 = fib2;
            fib2 = fib;
        }
    }
}
