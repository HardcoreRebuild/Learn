package DesignPatterns.SingletonDemo.lanhan;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
    懒汉式单例实现：
    1. 提供一个私有的不初始化static变量，
    2. 私有化构造器
    3. 调用getInstance时new一个对象
* */
public class SingletonDemo2 implements Serializable {
    // 延迟加载
    private static SingletonDemo2 instance;

    private SingletonDemo2(){
        //防止反射
        if(instance != null){
            throw new RuntimeException();
        }
    }
    //每次调用getInstance()都要同步，并发效率低
    public static synchronized SingletonDemo2 getInstance(){
        if(instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }

    // 反序列化时，返回单例对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
