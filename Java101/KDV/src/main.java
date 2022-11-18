import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int tutar;
        double kdv;
        double toplamFiyat;

        System.out.println("Ürün Fiyatını Giriniz");

        Scanner input = new Scanner(System.in);

        tutar = input.nextInt();

        if (tutar > 1000)
        {
            kdv = (tutar * 8) / 100;
        }
        else
            kdv = (tutar * 18) / 100;


        toplamFiyat = tutar + kdv;


        System.out.println("Ürünün son fiyatı: "+ toplamFiyat);
    }
}

