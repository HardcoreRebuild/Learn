package DesignPatterns.PrototypeDemo;

import java.util.Date;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 浅克隆，克隆对象的时间字段与原型对象指向同一个date，修改后互相影响
        System.out.println("浅克隆--------------------------");
        Date date1 = new Date();
        ShallowCloneObject s = new ShallowCloneObject("原型对象",date1);
        System.out.println(s.getName() + s.getCreateTime());
        ShallowCloneObject shallowCloneObject = (ShallowCloneObject)s.clone();
        System.out.println(shallowCloneObject.getName() + shallowCloneObject.getCreateTime());
        shallowCloneObject.setName("克隆对象");
        date1.setTime(1000000000000L);
        System.out.println(s.getName() + s.getCreateTime());
        System.out.println(shallowCloneObject.getName() + shallowCloneObject.getCreateTime());

        // 深复制
        System.out.println("深复制--------------------------");
        Date date2 = new Date();
        DeepCloneObject d = new DeepCloneObject("原型对象",date2);
        System.out.println(d.getName() + d.getCreateTime());
        DeepCloneObject deepCloneObject = (DeepCloneObject)d.clone();
        System.out.println(deepCloneObject.getName() + deepCloneObject.getCreateTime());
        deepCloneObject.setName("克隆对象");
        date2.setTime(1000000000000L);
        System.out.println(d.getName() + d.getCreateTime());
        System.out.println(deepCloneObject.getName() + deepCloneObject.getCreateTime());
    }
}
