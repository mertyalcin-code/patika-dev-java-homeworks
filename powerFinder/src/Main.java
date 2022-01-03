import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base,power,result=1;
        System.out.print("Taban:");
        base= scan.nextInt();
        System.out.print("Üst:");
        power= scan.nextInt();

        for (int i = 0; i < power; i++) {
            result*=base;
        }
        System.out.print("sonuç="+result);
    }
}
