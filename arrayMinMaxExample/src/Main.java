import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int input = 5;
        int min=input;
        int max=input;
        Arrays.sort(list);
        for (int i = 0; i <list.length ; i++) {
            if(input<list[i]){
                min= list[i-1];
                max= list[i];
                break;
            }
        }

        System.out.println(" sayıdan küçük en yakın sayı " + min);
        System.out.println(" sayıdan büyük en yakın sayı " + max);

    }
}
