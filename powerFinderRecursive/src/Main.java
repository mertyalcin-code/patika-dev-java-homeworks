import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban:");
        int n=scan.nextInt();
        System.out.print("Üstel:");
        int power=scan.nextInt();
        System.out.println("Sonuç:" +power(n,power));
    }
    static int power (int n,int power){
        if(power==0){
            return 1;
        }
        else return n*power(n,power-1);
    }
}
