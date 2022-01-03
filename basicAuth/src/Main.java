import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        Scanner scan = new Scanner(System.in);
        String username,password,response,newPassword;
        System.out.print("Kullanıcı adı:");
        username = scan.nextLine();
        System.out.print("Şifre:");
        password = scan.nextLine();
        if(username.equals("patika") && password.equals("java")){
            System.out.print("Başarılı giriş");
        }
        else {
            System.out.print("Hatalı giriş Şifrenizi sıfırlamak için e yazınız:");
            response = scan.nextLine();
            if(response.equals("e")){
                System.out.print("Yeni Şifre:");
                newPassword = scan.nextLine();
                while(newPassword.equals("java") || newPassword.equals(password)){
                    System.out.print("Hatalı şifre yeni şifre giriniz:");
                    newPassword = scan.nextLine();
                }
                System.out.print("Başarılı şekilde sıfırlandı");
            }
        }
    }
}
