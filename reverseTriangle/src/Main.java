import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int n = scan.nextInt();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; n%2==1 ? j <(n-i*2)+2 : j<(n-i*2)+3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
