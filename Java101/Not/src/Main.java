import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;
        int ortalama;

        System.out.println("Aldığınız notları sisteme giriniz");
        System.out.print("Matamatik: ");
        matematik =input.nextInt();
        System.out.print("Fizik: ");
        fizik = input.nextInt();
        System.out.print("Türkçe: ");
        turkce = input.nextInt();
        System.out.print("Kimya: ");
        kimya = input.nextInt();
        System.out.print("Müzik: ");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+turkce+kimya+muzik)/5;

        if ((matematik >=0) && (matematik<=100) && (fizik >=0) && (fizik<=100)&& (turkce >=0) && (turkce<=100)&& (kimya >=0) && (kimya<=100)&& (muzik >=0) && (muzik <=100)) {

            if (ortalama >= 55) {

                System.out.println("Tebrikler sınıfı geçtiniz\nOrtalamanız: " + ortalama);

            }else{
                System.out.println("Kaldınız\nOrtalamanız: "+ ortalama);
            }
        }else {
            System.out.println("Girilen notlar 0 ile 100 arasında olmalı hatalı giriş yaptınız.\nProgramı başlatıp yeniden not girişi yapınız.");
        }
    }
}
