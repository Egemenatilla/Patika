import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km ;
        double ucret = 10.0;

        System.out.println("Kaç km yol gidildi?");
        km = input.nextInt();

        ucret += km*(2.2);

        if (ucret < 20)
        {
            ucret = 20;
            System.out.println("Odenecek Ucret: "+ucret);
        }
        else
        {
            System.out.println("Odenecek Ucret: "+ucret);
        }


    }
}
