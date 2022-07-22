package DesignPatterns.FactoryDemo.FactoryMethodPatternDemo;

import DesignPatterns.FactoryDemo.SimpleFactoryDemo.TestObjectSimpleFactory;

public class ChildObjectOneFactory implements TestObjectMethodFactory {

    @Override
    public TestObject createTestObject  () {
        return new ChildObjectOne();
    }
}
