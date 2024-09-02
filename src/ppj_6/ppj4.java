package ppj_6;

public class ppj4 {
    public static void main(String[] args) {
        double[] tab = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (Math.random() * 100);
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                System.out.println(tab[i]);
            }
        }

        for (int i = 0; i < tab.length; i++) {
            int tmp = (int) tab[i];
            System.out.print(tmp);
            System.out.print("-->");
            if (tmp % 2 != 0) System.out.print(tab[i]);
            System.out.println();
        }

    }
}
