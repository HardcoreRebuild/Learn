package DesignPatterns.DecoratorDemo;

public class ConcreteComponent implements Component{
    @Override
    public void run() {
        System.out.println("ConcreteComponent run");
    }
}
