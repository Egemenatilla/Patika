import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;


        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Kenar:");
        a = input.nextInt();

        System.out.println("İkinci Kenar");
        b = input.nextInt();

        c = (int) Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);

        //Alan
        double u = (a+b+c) / 2;

        int alan = (int) Math.sqrt(u * ((u-a) * (u-b) * (u-c)));

        System.out.println("Alan: " + alan);


    }
}
