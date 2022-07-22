package DesignPatterns.FactoryDemo.SimpleFactoryDemo;

public class TestObjectSimpleFactory {
    public static TestObject createTestObject(String type){
        if(type.equals("one")){
            return new ChildObjectOne();
        } else if(type.equals("two")) {
            return new ChildObjectTwo();
        }
        return null;
    }
}
