import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // username = Egemen, password = Atilla
        Scanner input = new Scanner(System.in);
        String username,password;
        int balance=1500,secim,kosul = 1;
        int yatirilan=0,cekilen=0;

        while(kosul >0)
        {
            System.out.print("Kullanıcı Adınız :");
            username = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if(username.equals("Egemen")&&password.equals("Atilla"))
            {
                System.out.println("Giris Basarili");
                System.out.println("    MENU    \n(1)Para Yatırma \n(2)Para Cekme \n(3)Bakiye Sorgulama \n(4)Çıkış");
                secim = input.nextInt();

                switch (secim)
                {
                    case 1:
                    {
                        System.out.println("Yatırılacak Para Miktarı: ");
                        yatirilan = input.nextInt();
                        balance += yatirilan;
                        System.out.println("Yeni Bakiye:" + balance+"\n");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Çekilecek Para Miktarı: ");
                        cekilen = input.nextInt();
                        balance -= cekilen;
                        System.out.println("Yeni Bakiye:" + balance+"\n");
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Bakiye: "+balance+"\n");
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Cikis Yapiliyor"+"\n");
                        kosul = -1;
                        break;
                    }
                }
                }
            else
            {
                System.out.println("Yanlis Bilgi\n");
            }
        }
    }
}
