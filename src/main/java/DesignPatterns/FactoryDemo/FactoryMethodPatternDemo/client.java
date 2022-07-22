package DesignPatterns.FactoryDemo.FactoryMethodPatternDemo;

public class client {
    public static void main(String[] args) {
        TestObject a = new ChildObjectOneFactory().createTestObject();
        TestObject b = new ChildObjectTwoFactory().createTestObject();
        a.run();
        b.run();
    }
}
