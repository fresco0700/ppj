package ppj_6;

public class ppj8 {
    public static void main(String[] args) {
        char[] tab1 = {'a','l','k','z','Q'};

        char[] tab2 = new char[tab1.length];
        for(int i = 0; i < tab1.length; i++){
            tab2[i] = tab1[i];
        }

        for(int i = 0; i < tab2.length; i++){
            System.out.println(tab1[i] + "\t" + tab2[i]);
        }
    }
}
