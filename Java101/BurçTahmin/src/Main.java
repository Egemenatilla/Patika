import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int gun , ay;
        String burc;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doğduğunuz Ayı Sayı Olarak Giriniz : ");
        ay = input.nextInt();
        System.out.print("Lütfen Doğduğunuz Günü Sayı Olarak Giriniz : ");
        gun = input.nextInt();

        if (ay == 1){
            if (gun >=1 && gun<=31){
                if (gun<22){
                    System.out.print("Oğlak Burcu");
                }else {
                    System.out.print("Kova Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 2){
            if (gun >=1 && gun<=28){
                if (gun<20){
                    System.out.print("Kova Burcu");
                }else {
                    System.out.print("Balık Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 3){
            if (gun >=1 && gun<=31){
                if (gun<21){
                    System.out.print("Balık Burcu");
                }else {
                    System.out.print("Koç Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 4){
            if (gun >=1 && gun<=30){
                if (gun<21){
                    System.out.print("Koç Burcu");
                }else {
                    System.out.print("Boğa Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 5){
            if (gun >=1 && gun<=31){
                if (gun<22){
                    System.out.print("Boğa Burcu");
                }else {
                    System.out.print("İkizler Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 6){
            if (gun >=1 && gun<=30){
                if (gun<23){
                    System.out.print("İkizler Burcu");
                }else {
                    System.out.print("Yengeç Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 7){
            if (gun >=1 && gun<=31){
                if (gun<23){
                    System.out.print("Yengeç Burcu");
                }else {
                    System.out.print("Aslan Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 8){
            if (gun >=1 && gun<=31){
                if (gun<23){
                    System.out.print("Aslan Burcu");
                }else {
                    System.out.print("Başak Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 9){
            if (gun >=1 && gun<=30){
                if (gun<23){
                    System.out.print("Başak Burcu");
                }else {
                    System.out.print("Terazi Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 10){
            if (gun >=1 && gun<=30){
                if (gun<23){
                    System.out.print("Terazi Burcu");
                }else {
                    System.out.print("Akrep Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 11){
            if (gun >=1 && gun<=30){
                if (gun<23){
                    System.out.print("Akrep Burcu");
                }else {
                    System.out.print("Yay Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
        if (ay == 12){
            if (gun >=1 && gun<=31){
                if (gun<22){
                    System.out.print("Yay Burcu");
                }else {
                    System.out.print("Oğlak Burcu");
                }

            }else {
                System.out.print("Hatalı Giriş Yaptınız");
            }
        }
    }
}
