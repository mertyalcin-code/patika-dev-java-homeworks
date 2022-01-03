import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tam Sayı giriniz:");
        int num = scan.nextInt();
        int result = 0;
        String numString= String.valueOf(num);
        for(int i=0;i<numString.length();i++){
            result= result+ Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        System.out.print("basamaklar toplamı="+result);
    }
}
