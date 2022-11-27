public class Main{
    public static void main(String[] args) {

        int[] list = {1,27,34,865,2,6,12,56};

        int max = 0;

        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > max)
                max = list[i];
        }
        System.out.println("Max Number in the array is: "+ max);

    }
}
