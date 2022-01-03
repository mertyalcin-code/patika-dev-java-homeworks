import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //
        //Java ile kombinasyon hesaplayan program yazınız.
        //
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner scan = new Scanner(System.in);
        int n,r;
        System.out.print("n değeri:");
        n=scan.nextInt();
        System.out.print("r değeri:");
        r=scan.nextInt();
        int result= findFactorial(n)/(findFactorial(r)*findFactorial(n-r));
        System.out.print("Kombinasyon :"+result);
    }
    public static int findFactorial(int n){
        int result=1;
        for(int i=n;i>0;i--){
            result*=i;
        }
        return result;
    }
}
