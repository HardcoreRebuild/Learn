package DesignPatterns.FactoryDemo.AbstractFactoryDemo;

import DesignPatterns.FactoryDemo.AbstractFactoryDemo.TestObjectOne.TestObjectOne;

public class client {
    public static void main(String[] args) {
        TestAbstractFactory lowerFactory = new TestLowerFactory();
        TestAbstractFactory higherFactory = new TestHigherFactory();
        TestObjectOne a = lowerFactory.createTestObjectOne();
        TestObjectOne b = higherFactory.createTestObjectOne();

        a.runOne();
        a.runTwo();

        b.runOne();
        b.runTwo();
    }
}
