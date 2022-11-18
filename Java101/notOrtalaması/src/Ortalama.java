import java.util.Scanner;
public class Ortalama {
        public static void main(String[] args) {

            int mat,fizik,kimya,turkce,tarih,muzik;

            Scanner input = new Scanner(System.in);

            System.out.println("Matematik notunu giriniz: ");
            mat = input.nextInt();

            System.out.println("Fizik notunu giriniz: ");
            fizik = input.nextInt();

            System.out.println("Kimya notunu giriniz: ");
            kimya = input.nextInt();

            System.out.println("Turkce notunu giriniz: ");
            turkce = input.nextInt();

            System.out.println("Tarih notunu giriniz: ");
            tarih = input.nextInt();

            System.out.println("Muzik notunu giriniz: ");
            muzik = input.nextInt();

            int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
            double sonuc = toplam / 6;

            String s = sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(s);

        }
    }


