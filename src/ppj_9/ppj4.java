package ppj_9;

public class ppj4 {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Filip","Kubasiewicz", 2000);
        osoba.show();
    }
}

class Osoba{
    public String imie;
    public String nazwisko;
    public int rokurodzenia;

    public Osoba(String imie, String nazwisko, int rokurodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokurodzenia = rokurodzenia;
    }

    public void show(){
        System.out.println(imie + " " + nazwisko + " " + rokurodzenia);
    }
}
