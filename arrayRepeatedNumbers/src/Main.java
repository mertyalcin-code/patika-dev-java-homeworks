import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.

        int [] list = {3,7,3,3,2,9,10,21,1,6,33,9,1,10,2,2,2,4,5,8,8,9,10,1,1,3,6,2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int j : list) {
            if(j%2==0){
                if (!set.contains(j)) {
                    set.add(j);
                } else {
                    result.add(j);
                }
            }

        }
        System.out.println(result.toString());
    }
}
