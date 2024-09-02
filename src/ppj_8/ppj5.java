package ppj_8;

public class ppj5 {
    public static void main(String[] args) {
        // Przykładowe wywołanie metody
        printSquare(5, 'x');
        System.out.println();
        printSquare(4, 'o');
    }

    public static void printSquare(int size, char startChar) {
        // Zmienna pomocnicza do przechowywania naprzemiennego znaku
        char currentChar = startChar;

        // Iteracja przez wiersze
        for (int i = 0; i < size; i++) {
            // Iteracja przez kolumny
            for (int j = 0; j < size; j++) {
                System.out.print(currentChar);

                // Zmiana znaku na naprzemienny
                if (currentChar == 'x') {
                    currentChar = 'o';
                } else {
                    currentChar = 'x';
                }
            }

            // Przejście do nowego wiersza
            System.out.println();

            // Zmiana znaku początkowego dla nowego wiersza
            if (size % 2 == 0) {
                // Jeśli liczba znaków w wierszu jest parzysta, zaczynamy nowy wiersz od przeciwnych znaków
                if (currentChar == 'x') {
                    currentChar = 'o';
                } else {
                    currentChar = 'x';
                }
            }
        }
    }
}
