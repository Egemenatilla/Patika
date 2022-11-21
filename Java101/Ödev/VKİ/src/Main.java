import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,vki;

        // Boyun Kullanıcıdan Alınması
        System.out.print("Boy:");
        boy = input.nextDouble();
        // Kilonun Kullanıcıdan Alınması
        System.out.print("Kilo:");
        kilo = input.nextDouble();
        // VKİ Hesaplanması
        vki = (kilo / (boy * boy));
        System.out.println("Vücut Kitle İndexi: "+vki);


    }
}
