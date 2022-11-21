import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1,s2,secim;

        // Birinci Sayı
        System.out.println("Birinci Sayıyı Giriniz: ");
        s1 = input.nextInt();
        // İkinci Sayı

        System.out.println("İkinci Sayıyı Giriniz:");
        s2 = input.nextInt();

        System.out.println("Seçiminizi Yapınız!");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim = input.nextInt();

        //Switch Case
        switch (secim)
        {
            case 1:
                System.out.println(s1+s2);
                break;
            case 2:
                System.out.println(s1-s2);
                break;
            case 3:
                System.out.println(s1*s2);
                break;
            case 4:
                if(s2 != 0)
                {
                    System.out.println(s1/s2);

                }
                else
                    System.out.println("Bir sayı 0'a bölünemez");
                break;

            default:
                System.out.println("Lütfen Doğru Seçim Yapınız.");

        }
    }
}
