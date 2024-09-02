package ppj_10;

public class ppjxx {
    public static void main(String[] args) {

        Spawacz spawacz = new Spawacz("Chuj", "50 lat");
        spawacz.show();
    }
}

class Pracownik{
    private String nazwaFirmy;

    public Pracownik(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }
    public void show(){
        System.out.println(nazwaFirmy);
    }
}

class Spawacz extends Pracownik{
    private String stazSpawania;

    public Spawacz(String nazwaFirmy,String stazSpawania) {
        super(nazwaFirmy);
        this.stazSpawania = stazSpawania;
    }

    public void show(){
        System.out.println(stazSpawania);
        super.show();
    }
}
