package DesignPatterns.FactoryDemo.AbstractFactoryDemo;

import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne.TestObjectOne;
import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectTwo.TestObjectTwo;

public interface TestAbstractFactory {
    TestObjectOne createTestObjectOne();

    TestObjectTwo createTestObjectTwo();
}
