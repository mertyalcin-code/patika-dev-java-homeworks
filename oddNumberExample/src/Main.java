import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        int num=0,total=0;
        do {
            System.out.print("Sayı Giriniz:");
            num= scan.nextInt();
            if(num%4==0){
                total += num;
            }
        }while (num%2==0);
        System.out.println(total);
    }
}
