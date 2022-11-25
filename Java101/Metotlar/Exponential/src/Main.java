import java.util.Scanner;

public class Main {

    static int exponential(int base,int exponential)
    {
        if (exponential == 0)
            return 1;
        else if (exponential == 1)
            return base;
        else
            return base * exponential(base,(exponential - 1));
    }

    public static void main(String[] args) {
        //a^b
        Scanner input = new Scanner(System.in);
        int base,exponential;
        //Base
        System.out.println("Base: ");
        base = input.nextInt();
        //Exponential
        System.out.println("Exponential: ");
        exponential = input.nextInt();

        System.out.println(exponential(base,exponential));
    }
}
