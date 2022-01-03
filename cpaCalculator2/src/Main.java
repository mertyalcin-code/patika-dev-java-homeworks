import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        //
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        int physic,math,chem,turkish,history,music,sum = 0,count=0;
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
        if(!(physic<0 || physic>100)){
            sum = sum + physic;
            count++;
        }
        if(!(math<0 || math>100)){
            sum = sum + math;
            count++;
        }
        if(!(chem<0 || chem>100)){
            sum = sum + chem;
            count++;
        }
        if(!(turkish<0 || turkish>100)){
            sum = sum + turkish;
            count++;
        }
        if(!(history<0 || history>100)){
            sum = sum + history;
            count++;
        }
        if(!(music<0 || music>100)){
            sum = sum + music;
            count++;
        }
        System.out.println((sum/count)>55 ? "Geçtiniz":"Kaldınız" );

    }
}
