package DesignPatterns.BuilderDemo;

public class client {
    public static void main(String[] args) {
        TestObjectDirector d = new TestObjectDirectorImpl(new TestObjectBuilderImpl());
        TestObject t = d.directorTestObject();
    }
}
