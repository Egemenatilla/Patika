import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,alan,cevre,pi = 3.14;
        int aci;
        int dilimAlan;

        System.out.println("Yarıçapı Giriniz:");
        r = input.nextDouble();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Alan: "+alan+ "\n"+"Cevre: "+cevre);
        //Odev
        System.out.println("Acıyı Giriniz: ");
        dilimAlan = input.nextInt();

        int yeniAlan;
        yeniAlan = (int) ((pi*(r*r)*dilimAlan) / 360);

        System.out.println("Yeni Alan:" + yeniAlan);


    }
}
