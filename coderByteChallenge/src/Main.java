import java.util.*;
import java.io.*;

class Main {

    public static String LetterCapitalize(String str) {
        for(int i = 0;i<str.length();i++){
            if(i==0){
                str=str.substring(0,1).toUpperCase()+str.substring(1,str.length());
                System.out.println(str);
            }
            if(str.charAt(i)==' '){
                str=str.substring(0,i+1)+str.substring(i+1,i+2).toUpperCase()+str.substring(i+2,str.length());
            }
        }
        return str;
    }

    public static void main (String[] args) {
        int a = 5;
        int b = 9;
        int c = 0;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        System.out.println(b + "," + a);
    }

}