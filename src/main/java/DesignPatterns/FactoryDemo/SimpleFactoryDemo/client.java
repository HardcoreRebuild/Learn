package DesignPatterns.FactoryDemo.SimpleFactoryDemo;

public class client {
    public static void main(String[] args) {
        TestObject a = TestObjectSimpleFactory.createTestObject("one");
        TestObject b = TestObjectSimpleFactory.createTestObject("two");
        a.run();
        b.run();
    }
}
