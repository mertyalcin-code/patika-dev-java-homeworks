import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu:");
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print((i+1)+". Elemanı:");
            ints[i] = scanner.nextInt();
        }
        Arrays.sort(ints);
        System.out.print("Sıralama: ");
        for(int i : ints){
            System.out.print(i+" ");
        }
    }
}
