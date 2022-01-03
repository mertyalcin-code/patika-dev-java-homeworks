public class Main {
    public static void main(String[] args) {
        int start =2;
        int end = 100;

        for(int i = start;i<end ;i++){
            boolean isPrime=true;
            for (int j = 2; j <=i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
