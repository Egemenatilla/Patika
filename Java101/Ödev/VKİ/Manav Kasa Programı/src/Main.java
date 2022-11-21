import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00;
        int armutkg,elmakg,domateskg,muzkg,patlicankg;
        double toplam;

        Scanner inp = new Scanner(System.in);
        // Ürün KG'larını girilmesi
        System.out.println("Armut Kilo: ");
        armutkg = inp.nextInt();
        System.out.println("Elma Kilo: ");
        elmakg = inp.nextInt();
        System.out.println("Domates Kilo: ");
        domateskg = inp.nextInt();
        System.out.println("Muz Kilo: ");
        muzkg = inp.nextInt();
        System.out.println("Patlıcan Kilo: ");
        patlicankg = inp.nextInt();

        //Toplam Fiyat
        toplam = armutkg*armutFiyat+elmaFiyat*elmakg+domatesFiyat*domateskg+muzFiyat*muzkg+patlicanFiyat*patlicankg;
        System.out.println("Toplam: "+toplam);


    }
}
