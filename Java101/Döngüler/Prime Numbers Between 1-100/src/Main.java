public class Main {
    public static void main(String[] args) {
        System.out.print("Prime Numbers Between 1-100: ");
        for (int i = 2; i <= 100; i++)
        {
            boolean primes = true;
            for (int n = 2; n < i; n++)
            {
                if (i % n == 0)
                {
                    primes = false;
                    break;
                }
            }
            if (primes)
            {
                System.out.print(i + " ");
            }
        }
    }
}
