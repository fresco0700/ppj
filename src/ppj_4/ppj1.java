package ppj_4;

public class ppj1 {
    public static void main(String[] args) {
        int i = 10; // 10
        i = i++; //10
        i = ++i; //11
        i = i++ + ++i; // 11 + 13 = 24

        System.out.println(i);
    }
}
