import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner scan = new Scanner(System.in);
        double pi=3.14,area,r,a;
        System.out.print("Yarıçap:");
        r=scan.nextDouble();
        System.out.print("Açı:");
        a=scan.nextDouble();
        area=(pi*r*r*a)/a;
        System.out.println("Alan: "+area);
    }
}
