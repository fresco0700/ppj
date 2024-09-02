package ppj_6;

public class ppj2 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for( int i =0; i< tab.length; i++){
            tab[i] = (int) (Math.random() * 2);
            System.out.println(tab[i]);
        }
    }
}
