package egzamin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class zad5 {
    public static void main(String[] args) {

    }
}

class MyWriter{
    public static void main(String[] args) throws IOException {
        int[] arr = { 0b11111111, 0401, 514, 0x203};

        FileOutputStream fos = new FileOutputStream("out.bin");
        for (int i = arr.length-1; i >=0; i--) {
            fos.write(arr[i]);
        }
        fos.close();

        FileInputStream fis = new FileInputStream("out.bin");
        int tmp;
        while((tmp = fis.read())!=-1){
            System.out.print(tmp);
        }
        fis.close();
    }
}
