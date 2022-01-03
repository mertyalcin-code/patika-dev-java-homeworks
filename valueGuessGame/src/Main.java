import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rand.nextInt(100);
        int guess=-1;
        int i = 5;
        System.out.println(number);
        while(i>0){
            System.out.print("Tahmin edin: ");
            guess= scanner.nextInt();
            if(guess<0 ||guess >100){
                System.out.println("Hatalı aralık- hakkın gitti");
                System.out.println("Kalan hak: "+i);
                continue;
            }
            else {
                if(guess==number){
                    System.out.println("Tebrikler doğru bildin: "+number);
                    break;
                }
                else {
                    if(guess<number){
                        System.out.println("Biraz daha büyük tahim yap");
                        System.out.println("Kalan hak: "+(i-1));
                    }
                    else{
                        System.out.println("Biraz daha küçük tahmin yap");
                        System.out.println("Kalan hak: "+(i-1));
                    }
                }
            }
            i--;
        }
        if(guess!=number){
            System.out.println("Kaybettiniz, sayı: "+number);
        }
    }
}

