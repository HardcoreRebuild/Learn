package DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne;

public class TestObjectOneLower implements TestObjectOne {
    @Override
    public void runOne() {
        System.out.println("TestObjectOneLower runOne");
    }
    @Override
    public void runTwo() {
        System.out.println("TestObjectOneLower runTwo");
    }
}
