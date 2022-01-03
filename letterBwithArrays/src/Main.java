public class Main {
    public static void main(String[] args) {
        int[][] list = new int[7][4];

        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if(i==0 || i==3 || i==6){
                    System.out.print(" * ");
                }
                else {
                    if(j==0 || j==3){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
