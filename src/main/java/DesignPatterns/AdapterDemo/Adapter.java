package DesignPatterns.AdapterDemo;

/*
* 适配器(类适配器方式)
* */
public class Adapter extends Adaptee implements Target{
    @Override
    public void handleRequest() {
        super.request();
    }
}
