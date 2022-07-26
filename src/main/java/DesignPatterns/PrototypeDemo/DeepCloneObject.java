package DesignPatterns.PrototypeDemo;

import java.util.Date;

public class DeepCloneObject implements Cloneable{

    private String name;

    private Date createTime;

    public DeepCloneObject(String name, Date createTime){
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        DeepCloneObject deepCloneObject = (DeepCloneObject) object;
        deepCloneObject.createTime = ((Date) this.createTime.clone());
        return object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
