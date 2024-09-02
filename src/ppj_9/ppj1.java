package ppj_9;

public class ppj1 {
    public static void main(String[] args) {
        MethodCurrier methodCurrier = new MethodCurrier();
        methodCurrier.setValue(5);
        methodCurrier.setValue(5f);
    }
}

class MethodCurrier{

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
