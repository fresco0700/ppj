package ppj_7;

public class ppj2 {
    public static void main(String[] args) {
        int[][] tab2d = new int[8][8];
        int[] counts = new int[10];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tab2d[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tab2d[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 8; i++){
            counts[tab2d[i][i]]++;

        }
        System.out.println();
        for(int i = 0; i < 8; i++){
            counts[tab2d[i][tab2d.length-1-i]]++;
        }

        for(int liczba : counts){
            if(liczba > 3){
                System.out.println("Spelniono warunek dla liczby :" + liczba);
            }
        }
    }
}
