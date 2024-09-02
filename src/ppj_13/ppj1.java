package ppj_13;

import java.io.FileInputStream;

public class ppj1 {
    public static void main(String[] args){
        int count = 0;
        char[] tab = new char[100];
        try {
            FileInputStream fis = new FileInputStream("src/ppj_13/file");
            while(fis.available()>0){
                tab[count] = (char)fis.read();
                count++;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        for( char l : tab){
            if (l == '\0') break;
            System.out.println(l);
        }

    }
}
