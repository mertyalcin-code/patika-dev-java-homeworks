import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear;
        System.out.print("Doğum Yılınız:");
        birthYear = scan.nextInt();
        int num = birthYear%12;
        String zodiac="";
        switch (num){
            case 0-> zodiac="Maymun";
            case 1-> zodiac="Horoz";
            case 2-> zodiac="Köpek";
            case 3-> zodiac="Domuz";
            case 4-> zodiac="Fare";
            case 5-> zodiac="Öküz";
            case 6-> zodiac="Kaplan";
            case 7-> zodiac="Tavşan";
            case 8-> zodiac="Ejderha";
            case 9-> zodiac="Yılan";
            case 10-> zodiac="At";
            case 11-> zodiac="Koyun";
            default -> zodiac="Hata";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+zodiac);
    }
}
