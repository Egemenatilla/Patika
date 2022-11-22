import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayiyi Giriniz:");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++)
        {
            if(i % 4 == 0 || i % 5 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
