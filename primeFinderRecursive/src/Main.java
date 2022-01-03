import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int n= scan.nextInt();
        System.out.println(isPrime(n,2));
    }
    static boolean isPrime(int n,int i){
        if(i==n){
            return true;
        }
        if(n%i==0){
            return false;
        }

        return isPrime(n,i++);
    }
}
