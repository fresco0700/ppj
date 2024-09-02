package ppj_10;

public class ppj1 {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();
    }
}


class Kwadrat{
    private int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public void show(){
        System.out.println(bok*bok);
    }

}