import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        double price,tax=0;
        System.out.print("Lütfen tutarı giriniz:");
        price =scan.nextDouble();
        System.out.println("KDV'siz fiyat = "+price);
        if(price>0 &&price<=1000){
            tax=0.18;
        }
        else if(price>1000){
            tax=0.08;
        }
        System.out.println("KDV oranı= "+tax);
        System.out.println("KDV'li fiyat = "+(price+(price*tax)));
        System.out.println("KDV tutarı = "+price*tax);
    }
}
