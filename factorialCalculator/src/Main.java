import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyel alınacak sayı:");
        int n= scan.nextInt();
        int result=1;
        for(int i=n;i>0;i--){
            result*=i;
        }
        System.out.println(n +" faktöriyeli: "+result);
    }
}
