import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        double toplam=0;

        System.out.println("Lutfen pozitif bir sayi giriniz:");
        sayi = scan.nextInt();

        for (double i = 1; i <= sayi; i++) {

            toplam += 1 / i;
        }
        System.out.println(toplam);
    }
    }

