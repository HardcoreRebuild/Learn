package DesignPatterns.CompositeDemo;

public class Client {
    public static void main(String[] args) {
        Component c1 = new LeafOneImpl("叶子节点1");
        Component c2 = new LeafTwoImpl("叶子节点2");
        CompositeImpl c3 = new CompositeImpl("容器节点");
        CompositeImpl c4 = new CompositeImpl("子容器节点");

        c3.add(c1);
        c4.add(c2);
        c2.operation();
        c3.operation();
    }
}
