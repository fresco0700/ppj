package egzamin;

public class zad8 {
    public static void main(String[] args) {
        Jabuszko jabuszko = new Jabuszko("Cjik");
    }
}

class Jabuszko{
    private String location;
    private boolean robaczek;

    public Jabuszko(String location) {
        this.location = location;
        this.robaczek = Math.random() < 0.5 ? true : false;
        validate();
    }

    private void validate() {
        if (robaczek)
            throw  new RobaczeException();
    }
}

class RobaczeException extends RuntimeException {
    public RobaczeException() {
        super("Chuj");
    }
}