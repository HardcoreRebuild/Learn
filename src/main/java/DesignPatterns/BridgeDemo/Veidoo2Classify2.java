package DesignPatterns.BridgeDemo;

public class Veidoo2Classify2 extends Veidoo2{

    public Veidoo2Classify2(Veidoo1 veidoo1){
        super(veidoo1);
    }

    @Override
    public void veidoo2Method(){
        super.veidoo2Method();
        System.out.println("Veidoo2Classify2");
    }
}
