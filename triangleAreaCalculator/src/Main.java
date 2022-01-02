import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Formül
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        Scanner scan = new Scanner(System.in);
        double a,b,c,u,area;
        System.out.print("ilk Kenar uzunluğu (m): ");
        a= scan.nextDouble();
        System.out.print("ikinci Kenar uzunluğu (m): ");
        b= scan.nextDouble();
        System.out.print("üçüncü Kenar uzunluğu (m): ");
        c= scan.nextDouble();
        u = (a+b+c) / 2;
        area= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan: "+area+" m2");
    }
}
