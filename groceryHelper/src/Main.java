import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //
        //Meyveler ve KG Fiyatları
        //
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        Scanner scan = new Scanner(System.in);
        double pear,apple,tomatoes,banana,eggplant,sum;
        double pearPrice=2.14,applePrice=3.67,tomatoesPrice=1.11,bananaPrice=0.95,eggplantPrice=5.00;
        System.out.print("Armut(kg):");
        pear = scan.nextDouble();
        System.out.print("Elma(kg):");
        apple = scan.nextDouble();
        System.out.print("Domates(kg):");
        tomatoes = scan.nextDouble();
        System.out.print("Muz(kg):");
        banana = scan.nextDouble();
        System.out.print("Patlıcan(kg):");
        eggplant = scan.nextDouble();
        sum = (pear*pearPrice)
                +(apple*applePrice)
                +(tomatoes*tomatoesPrice)
                +(banana*bananaPrice)
                +(eggplant*eggplantPrice);
        System.out.println("Toplam: "+sum+" TL");

}
}
