import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */
        Scanner scan = new Scanner(System.in);
        int temp;
        System.out.print("Sıcaklık giriniz:");
        temp=scan.nextInt();
        if(temp<5) System.out.println("Kayağa gidebilirsiniz");
        else if(temp<15) System.out.println("Sinemaya Gidebilirsiniz");
        else if(temp<25) System.out.println("Pikniğe Gidebilirsiniz");
        else System.out.println("Yüzmeye Gidebilirsiniz");
    }
}
