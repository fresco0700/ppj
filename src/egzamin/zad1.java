package egzamin;

public class zad1 {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 15;
            System.out.print(b + " " + a + " ");
            b += 2;
            a = b;
        }
        int b = 20;
        System.out.print(b + " " + a);
    }
}
