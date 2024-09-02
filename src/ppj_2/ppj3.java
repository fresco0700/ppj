package ppj_2;

public class ppj3 {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println(number & 0b11111);
        System.out.println(number >>6 & 1);
        byte byte1 = (byte) ((number >> 24) & 0xFF); // Najbardziej znaczący bajt
        byte byte2 = (byte) ((number >> 16) & 0xFF); // Drugi bajt
        byte byte3 = (byte) ((number >> 8) & 0xFF);  // Trzeci bajt
        byte byte4 = (byte) (number & 0xFF);         // Najmniej znaczący bajt

        // Wyświetlanie wartości poszczególnych bajtów
        System.out.println("Most significant byte: " + (byte1 & 0xFF));
        System.out.println("Second byte: " + (byte2 & 0xFF));
        System.out.println("Third byte: " + (byte3 & 0xFF));
        System.out.println("Least significant byte: " + (byte4 & 0xFF));

        // Obliczanie wartości dwóch środkowych bajtów
        int middleBytesValue = ((byte2 & 0xFF) << 8) | (byte3 & 0xFF);
        System.out.println("Value of the middle two bytes: " + middleBytesValue);
    }
}
