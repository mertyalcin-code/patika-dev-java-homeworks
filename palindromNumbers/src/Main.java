import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
        //
        //Palindrom Sayı Nedir ?
        //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
        //
        //Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int num= scan.nextInt();
        System.out.println(isPalindrom(num));
    }
    public static boolean  isPalindrom(int num){
        int temp = num,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber= temp %10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp /=10;
        }
        return num == reverseNumber;

    }
}
