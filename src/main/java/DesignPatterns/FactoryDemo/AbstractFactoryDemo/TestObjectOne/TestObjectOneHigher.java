package DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne;

public class TestObjectOneHigher implements TestObjectOne {
    @Override
    public void runOne() {
        System.out.println("TestObjectOneHigher runOne");
    }
    @Override
    public void runTwo() {
        System.out.println("TestObjectOneHigher runTwo");
    }
}
