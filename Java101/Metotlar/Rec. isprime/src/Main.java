import java.util.Scanner;

public class Main {
    static int isprime(int a,int i)
    {
        if (i == 1)
        {
            return 1;
        } else {
            {
                if (a % i == 0)
                {
                    return 0;
                } else {
                    return isprime(a, i - 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter positive number: ");
        int b = a.nextInt();

        int c = isprime(b, b / 2);

        if (c == 1)
        {
            System.out.println(b + " is prime ");
        }
        else
        {
            System.out.println(b + " is not prime");
        }
    }
}
