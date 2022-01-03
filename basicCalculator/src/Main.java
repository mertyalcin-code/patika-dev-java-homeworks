import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double num1,num2;
       int select;
       Scanner scan = new Scanner(System.in);
       System.out.print("ilk Sayı:");
       num1=scan.nextDouble();
        System.out.print("ikinci Sayı:");
        num2=scan.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=scan.nextInt();
        switch (select) {
            case 1 -> System.out.println(num1 + num2);
            case 2 -> System.out.println(num1 - num2);
            case 3 -> System.out.println(num1 * num2);
            case 4 -> System.out.println(num1 / num2);
            default -> System.out.println("Hatalı işlem");
        }
    }
}
