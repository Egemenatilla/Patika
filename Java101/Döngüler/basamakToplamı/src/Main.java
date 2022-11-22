import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,sonuc = 0;
        System.out.println("Sayı Giriniz:");
        a = input.nextInt();

        while(a!= 0)
        {
            b = a % 10;
            sonuc += b;
            a = a / 10;
        }
        System.out.println("Sonuc: "+sonuc);
    }
}
