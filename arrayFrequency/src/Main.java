import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] ints = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap<Integer,Integer> set= new HashMap<>();
        for (int i : ints){
            if(!set.containsKey(i)){
                set.put(i,1);
            }
            else {
                set.put(i,set.get(i)+1);

            }
        }
        set.forEach((key, value) -> System.out.println(key + " sayısı " + value+" kere tekrar edildi"));
    }
}
