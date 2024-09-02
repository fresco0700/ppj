package ppj_6;

public class ppj6 {
    public static void main(String[] args) {
        int tab[] = {789,678,567};
        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                System.out.println("--" + tab[i] + "--" + tab[j]);
                System.out.println(tab[i] - tab[j]);
            }
        }
    }
}
