package DesignPatterns.CompositeDemo;

public class LeafTwoImpl implements Component{
    private String name;

    public LeafTwoImpl(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("ComponentTwoImpl " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
