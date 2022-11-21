import java.util.Scanner;

public class Kullanıcı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username,password,sifre,secim;


        // Kullanıcı Adı
        System.out.println("Kullanıcı Adınız: ");
        username = input.nextLine();
        // Şifre
        System.out.println("Şifrenizi Giriniz");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giriş Yapıldı!");
        }
        else
        {
            System.out.println("Yanlış Şifre Girdiniz");
            System.out.println("Şifrenizi Değiştirmek ister misiniz?");
            System.out.println("(Evet)  (Hayır)");
            secim = input.nextLine();
            if(secim.equals("Evet"))
            {
                System.out.print("Yeni Şifre: ");
                sifre = input.nextLine();
                if(sifre.equals("java123"))
                    System.out.println("Yeni şifreniz, eski şifreyle aynı olamaz");
                else
                    System.out.println("Başarıyla Değiştirildi...");
            }
            else
                System.out.println("Değiştirilmeden çıkılıyor...");
        }

    }
}
