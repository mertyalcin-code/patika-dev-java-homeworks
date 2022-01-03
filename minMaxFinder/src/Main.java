import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int n= scan.nextInt();
        int min,max;
        System.out.print("Sayı Giriniz:");
        int input = scan.nextInt();
        min=input;
        max=input;
        for (int i = 1; i < n; i++) {
            System.out.print("Sayı Giriniz:");
            input=scan.nextInt();
            if(input<min){
               min=input;
            }
            if (input>max){
                max=input;
            }
        }
        System.out.println("Maksimum değer: "+max);
        System.out.println("Minimum değer: "+min);
    }
}
