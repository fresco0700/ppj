package ppj_9;

public class ppj2 {
    public static void main(String[] args) {
        Number n = new Number();
        n.setValue(5);
        MethodCurrier2 m = new MethodCurrier2();
        m.setValue(5);
        m.setValue(n);


    }
}
class Number{
    int number;

    public void setValue(int number){
        this.number = number;
    }

    public void showValue(){
        System.out.println(number);
    }
}
class MethodCurrier2{

    public void setValue(int x){
        System.out.println(x);
    }
    public void setValue(float x){
        System.out.println(x);
    }
    public void setValue(Number number){
        System.out.println(number.number);
    }


}