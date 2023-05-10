package codeBro.javaCore.generics;

public class MyGenerics<A,B>{
    A a;
    B b;

    MyGenerics(){

    }
    MyGenerics(A a){
        this.a = a;
    }

    public MyGenerics(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public Object[] getAll(){
        return new Object[]{a, b};
    }
}
