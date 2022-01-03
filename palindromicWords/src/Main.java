import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Değer giriniz:");
        String str= scan.nextLine();
        System.out.println(isPalindrom(str));
    }
    static boolean isPalindrom(String str){
       str= str.replace(" ","");
       str = str.toLowerCase();
       String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        return str.equals(reverse);
    }
}
