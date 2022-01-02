import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //
        //Formül
        //Kilo (kg) / Boy(m) * Boy(m)
        double height,weight,index;
        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuz(m): ");
        height= scan.nextDouble();
        System.out.print("Kilonuz(kg): ");
        weight= scan.nextDouble();
        index=weight/(height*height);
        System.out.println("Vucut kitle indexiniz: "+index);
    }
}
