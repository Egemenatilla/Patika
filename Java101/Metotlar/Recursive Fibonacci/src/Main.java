public class Main {

    static int recFibonacci(int n)
    {
        if (n==1 || n==2)
            return 1;

        return recFibonacci(n - 1) + recFibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(recFibonacci(5));

    }
}
