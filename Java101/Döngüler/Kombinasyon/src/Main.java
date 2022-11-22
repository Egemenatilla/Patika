import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,faktn=1,faktr=1,faktn_r=1;
        System.out.println("n: ");
        n = input.nextInt();
        System.out.println("r: ");
        r = input.nextInt();

        for (int i = 1; i < n+1; i++)
        {
            faktn *= i;

        }
        for (int i = 1; i < r+1; i++)
        {
            faktr *= i;

        }
        for (int i = 1; i < n-r+1; i++)
        {
            faktn_r *= i;

        }
        int kombinasyon = (faktn) / (faktr * faktn_r);
        System.out.println("C("+n+","+r+") = "+ kombinasyon);
    }
}
