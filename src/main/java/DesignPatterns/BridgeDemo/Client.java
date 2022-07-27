package DesignPatterns.BridgeDemo;

public class Client {
    public static void main(String[] args) {
        Veidoo2 o1 = new Veidoo2Classify1(new Veidoo1Classify1());
        Veidoo2 o2 = new Veidoo2Classify2(new Veidoo1Classify1());
        Veidoo2 o3 = new Veidoo2Classify1(new Veidoo1Classify2());
        Veidoo2 o4 = new Veidoo2Classify2(new Veidoo1Classify2());
        o1.veidoo2Method();
        o2.veidoo2Method();
        o3.veidoo2Method();
        o4.veidoo2Method();
    }
}
