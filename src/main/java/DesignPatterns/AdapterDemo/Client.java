package DesignPatterns.AdapterDemo;

public class Client {
    public void test(Target t){
        t.handleRequest();
    }

    public static void main(String[] args) {
        // 1. 类适配器
        Client c1 = new Client();
        Target t1 = new Adapter();
        c1.test(t1);
        // 2. 对象组合适配器
        Client c2 = new Client();
        Adaptee a = new Adaptee();
        Target t2 = new Adapter2(a);
        c2.test(t2);
    }
}
