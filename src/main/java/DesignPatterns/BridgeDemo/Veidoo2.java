package DesignPatterns.BridgeDemo;

public class Veidoo2 {
    protected Veidoo1 veidoo1;

    public Veidoo2(Veidoo1 veidoo1){
        this.veidoo1 = veidoo1;
    }

    public void veidoo2Method(){
        veidoo1.veidoo1Method();
    }
}
