package DesignPatterns.FactoryDemo.AbstractFactoryDemo;

import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne.TestObjectOneHigher;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne.TestObjectOne;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo.TestObjectTwoHigher;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo.TestObjectTwo;

public class TestHigherFactory implements TestAbstractFactory {
    @Override
    public TestObjectOne createTestObjectOne() {
        return new TestObjectOneHigher();
    }

    @Override
    public TestObjectTwo createTestObjectTwo() {
        return new TestObjectTwoHigher();
    }
}
