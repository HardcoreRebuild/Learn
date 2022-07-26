package DesignPatterns.BuilderDemo;

public class TestObjectBuilderImpl implements TestObjectBuilder{
    @Override
    public ComponentA builderComponentA() {
        System.out.println("构建组件A");
        return new ComponentA("组件A");
    }

    @Override
    public ComponentB builderComponentB() {
        System.out.println("构建组件B");
        return new ComponentB("组件B");
    }
}
