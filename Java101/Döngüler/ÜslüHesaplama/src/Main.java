import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban,ust,sonuc = 1;
        //Taban Değeri
        System.out.println("Taban Değerini Giriniz: ");
        taban = input.nextInt();
        //Üst Değeri
        System.out.println("Üst Değerini Giriniz: ");
        ust = input.nextInt();
        //Hesaplama Sonucu
        for(int i = 0; i<ust; i++)
        {
            sonuc *= taban;
        }
        System.out.println("Sonuc: "+ sonuc);
    }
}
