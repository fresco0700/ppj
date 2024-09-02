package ppj_8;

public class ppj3 {
    public static void main(String[] args) {
        char[] charArray = "Ala ma kota".toCharArray();
        String query = "a";

        int count = countOccurrences(charArray, query);
        System.out.println("Liczba wystąpień: " + count);
    }

    public static int countOccurrences(char[] array, String query) {
        int count = 0;
        for (char c : array) {
            if (query.indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }
}
