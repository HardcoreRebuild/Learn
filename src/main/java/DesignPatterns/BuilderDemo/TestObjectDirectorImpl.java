package DesignPatterns.BuilderDemo;

public class TestObjectDirectorImpl implements TestObjectDirector{

    private TestObjectBuilder builder;

    public TestObjectDirectorImpl(TestObjectBuilder builder){
        this.builder = builder;
    }

    @Override
    public TestObject directorTestObject() {
        ComponentA a = builder.builderComponentA();
        ComponentB b = builder.builderComponentB();
        TestObject t = new TestObject();
        t.setComponentA(a);
        t.setComponentB(b);
        return t;
    }
}
