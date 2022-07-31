package DesignPatterns.DecoratorDemo;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
        addMethod();
    }

    public void addMethod(){
        System.out.println("ConcreteDecorator addMethod");
    }
}
