import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam = 0,count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi: ");
        sayi = input.nextInt();

        for (int i = 1; i<= sayi; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                toplam += i;
                count++;
            }

        }
        System.out.println(toplam/count);

    }
}
