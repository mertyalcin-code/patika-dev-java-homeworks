import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int n = scan.nextInt();
        method(n,n,true);

    }
    static void method(int n,int temp,boolean mode){
        System.out.print(" " + temp);
        if(temp <= 0) {
            mode = false;
        }
        int next = mode ? temp - 5 : temp + 5;
        if(next <= n) {
            method(n, next, mode);
        }
    }
}
