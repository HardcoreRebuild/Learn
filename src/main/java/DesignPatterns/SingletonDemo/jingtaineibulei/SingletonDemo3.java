package DesignPatterns.SingletonDemo.jingtaineibulei;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
    静态内部类单例实现：
    1. 私有化构造器
    2. 创建静态内部类，在其中提供一个私有的static变量，存放唯一对象
    3. 提供开放的方法访问对象
* */
public class SingletonDemo3 implements Serializable {
    // 外部类没有static属性，则不会立即加载对象，也不会加载静态内部类
    private static class SingletonClassInstance{
        // 调用时加载静态内部类，加载类时天然线程安全。instance是static final修饰，保证内存中只有一个实例存在并且不能被修改
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }

    private SingletonDemo3(){
        //防止反射
//        if(SingletonClassInstance.instance != null){
//            throw new RuntimeException();
//        }
    }

    public static SingletonDemo3 getInstance(){
        return SingletonClassInstance.instance;
    }

    // 反序列化时，返回单例对象
    private Object readResolve() throws ObjectStreamException {
        return SingletonClassInstance.instance;
    }
}
