package DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo;

public class TestObjectTwoHigher implements TestObjectTwo {
    @Override
    public void runOne() {
        System.out.println("TestObjectTwoHigher runOne");
    }

    @Override
    public void runTwo() {
        System.out.println("TestObjectTwoHigher runTwo");
    }
}