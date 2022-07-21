package DesignPatterns.SingletonDemo.ehan;

public class Client {
    public static void main(String[] args) {
        SingletonDemo1 a = SingletonDemo1.getInstance();
        SingletonDemo1 b = SingletonDemo1.getInstance();
        System.out.println(a == b); // true
    }
}
