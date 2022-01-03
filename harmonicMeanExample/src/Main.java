import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int number : numbers) {
            sum += 1.0/number;
        }
        System.out.println(numbers.length / sum);



    }
}
