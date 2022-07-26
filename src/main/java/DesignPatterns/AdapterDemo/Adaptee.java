package DesignPatterns.AdapterDemo;

/*
* 被适配的类
* */
public class Adaptee {

    public void request(){
        System.out.println("被适配的类提供客户端需要的功能");
    }
}
