import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        //
        //Not : If ve Else kullanılmayacak...
        int physic,math,chem,turkish,history,music;
        Scanner input = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        physic = input.nextInt();
        System.out.println("Matematik notunuzu giriniz: ");
        math = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        chem = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkish = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        history = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        music = input.nextInt();
        System.out.println(((physic + math + chem + turkish + history + music) / 6) > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }
}
