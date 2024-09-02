package ppj_5;

public class ppj1 {
    public static void main(String[] args) {
        int K = 987654321;
        String s = "";
        while(K != 0){
            System.out.println("Iteracja...");
            System.out.println(K);
            int cyfra = K % 10;
            System.out.println(cyfra);
            s =s + cyfra;
            System.out.println(s);
            K = K /10;
            System.out.println(K);
        }
    }
}
