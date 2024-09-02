package ppj_7;

public class ppj1 {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3};
        int[] tab2 = {4,5,6};
        int[] tab3 = {7,8,9};

        int[][] tab4 = {tab1,tab2,tab3};

        for (int i = 0; i < tab4.length; i++) {
            for (int j = 0; j < tab4[i].length; j++) {
                System.out.print(tab4[i][i] + " ");
            }
        }
    }
}
