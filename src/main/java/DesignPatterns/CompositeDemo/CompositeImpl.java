package DesignPatterns.CompositeDemo;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.ArrayList;
import java.util.List;

public class CompositeImpl implements Component{
    private String name;
    private List<Component> list = new ArrayList<>();

    public CompositeImpl(String name) {
        this.name = name;
    }

    public void add(Component component){
        list.add(component);
    }

    public void remove(Component component){
        list.remove(component);
    }

    public Component getChild(int index){
        return list.get(index);
    }

    @Override
    public void operation() {
        System.out.println("CompositeImpl"+name);
        for(Component c:list){
            c.operation();
        }
    }
}
