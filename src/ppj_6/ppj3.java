package ppj_6;

public class ppj3 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for( int i =0; i< tab.length; i++){
            tab[i] = (int) (Math.random() * 2);
            System.out.println(tab[i]);
        }

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i< tab.length; i++){
            if (tab[i] == 0) count0++;
            else count1++;
        }

        System.out.println("Zer jest: " + count0 + ", a jedynek jest: " + count1);
    }
}
