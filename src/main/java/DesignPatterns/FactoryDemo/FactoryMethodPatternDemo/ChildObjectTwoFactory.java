package DesignPatterns.FactoryDemo.FactoryMethodPatternDemo;

public class ChildObjectTwoFactory implements TestObjectMethodFactory {

    @Override
    public TestObject createTestObject  () {
        return new ChildObjectTwo();
    }
}