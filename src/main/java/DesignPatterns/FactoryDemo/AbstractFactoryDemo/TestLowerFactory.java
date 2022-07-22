package DesignPatterns.FactoryDemo.AbstractFactoryDemo;

import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne.TestObjectOne;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne.TestObjectOneLower;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo.TestObjectTwo;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo.TestObjectTwoLower;

public class TestLowerFactory implements TestAbstractFactory{

    @Override
    public TestObjectOne createTestObjectOne() {
        return new TestObjectOneLower();
    }

    @Override
    public TestObjectTwo createTestObjectTwo() {
        return new TestObjectTwoLower();
    }
}
