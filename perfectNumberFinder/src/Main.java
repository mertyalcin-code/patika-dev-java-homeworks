import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int num = scan.nextInt();
        int sum=0;

        for (int i = 1; i<=num/2 ; i++) {
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println(num+"  mükemmel sayıdır.");
        }
        else System.out.println(num+" mükemmel sayı değildir");
    }
}
