package DesignPatterns.PrototypeDemo;

import java.io.Serializable;
import java.util.Date;

public class ShallowCloneObject implements Cloneable, Serializable {
    private String name;

    private Date createTime;

    public ShallowCloneObject(String name, Date createTime){
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
