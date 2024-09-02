package ppj_4;

import java.util.Scanner;

public class ppj6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        String result = switch(M){
            case 3 -> (D >21) ? "Wiosna" : "ZIMA";
            case 4,5 -> "Wiosna";
            case 6 -> (D > 20) ? "Lato" : "Wiosna";
            case 7,8 -> "Lato";
            case 9 -> (D > 23) ? "Jesien" : "Lato";
            case 10,11 -> "Jesien";
            case 12 -> (D > 22) ? "Zima" : "Jesien";
            case 1,2 -> "Zima";
            default -> "BLAD";

        };

        System.out.println(result);
    }
}
