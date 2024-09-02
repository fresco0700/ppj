package egzamin;

public class ppj6 {
    public static void main(String[] args) {
        B b = new B(5,2.0);
        b.show();
    }
}


class A {
    private int value;
        public A(int value) {
            this.value = value;
        }

    public void show(){
        System.out.print(value);
    }
}

class B extends A {
    private double size;
    public B(int value,double size) {
        super(value);
        this.size = size;
    }

    public void show(){
        System.out.print(size);
        super.show();
    }

}