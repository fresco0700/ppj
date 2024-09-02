package ppj_7;

public class ppj4 {
    public static void main(String[] args) {

        int[] tab1 = {2,5,1,2,3};
        selectionSort(tab1);
        for(int liczba : tab1){
            System.out.println(liczba);
        }
    }

    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int swap = a[min];
            a[min] = a[i];
            a[i] = swap;
        }
    }
}
