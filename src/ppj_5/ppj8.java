package ppj_5;

import java.util.Scanner;

public class ppj8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (scanner.hasNext()){
            String option = scanner.next();
            String[] compas = {"West", "East", "North", "South"};
            if (option.equals("A")){
                index--;
                if (index <0) index = 3;
            } else if (option.equals("D")){ index++;}
            else System.out.println("Nieznana komenda");
            System.out.println(compas[index]);
        }
    }
}
