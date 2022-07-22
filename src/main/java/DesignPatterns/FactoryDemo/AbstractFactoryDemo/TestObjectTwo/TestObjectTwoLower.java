package DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo;

public class TestObjectTwoLower implements TestObjectTwo {
    @Override
    public void runOne() {
        System.out.println("TestObjectTwo runOne");
    }

    @Override
    public void runTwo() {
        System.out.println("TestObjectTwo runTwo");
    }
}