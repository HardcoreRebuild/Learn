package DesignPatterns.AdapterDemo;
/*
 * 适配器(对象适配器方式)
 * */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    public Adapter2(Adaptee a){
        super();
        this.adaptee = a;
    }
    @Override
    public void handleRequest() {
        adaptee.request();
    }
}