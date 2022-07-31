package DesignPatterns.CompositeDemo;

public class LeafOneImpl implements Component{
    private String name;

    public LeafOneImpl(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("ComponentImpl " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
