package DesignPatterns.SingletonDemo.ehan;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
    饿汉式单例实现：
    1. 私有化构造器
    2. 提供一个私有的static变量，存放唯一对象
    3. 提供开放的方法访问对象
* */
public class SingletonDemo1 implements Serializable {
    // 类初始化时。立即加载这个对象。存在问题：如果不调用getInstance()则会造成资源浪费
    private static /*final*/ SingletonDemo1 instance = new SingletonDemo1();
    private SingletonDemo1(){
        //防止反射
        if(instance != null){
            throw new RuntimeException();
        }
    }

    // static变量在类加载时初始化,不会发生并发访问的问题
    public static /*synchronized*/ SingletonDemo1 getInstance(){
        return instance;
    }

    // 反序列化时，返回单例对象
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
