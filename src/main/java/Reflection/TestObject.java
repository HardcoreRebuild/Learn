package Reflection;

import MyAnnotation.TestObjectField;

public class TestObject {

    public TestObject(){

    }

    public TestObject(int id,String name){
        this.id = id;
        this.name = name;
    }
    private int id;
    private String name;

    protected int a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
