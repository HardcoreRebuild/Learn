package DesignPatterns.SingletonDemo;

import DesignPatterns.SingletonDemo.ehan.SingletonDemo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
* 反射
* */
public class ReflactClientForBugs {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SingletonDemo1> clazz = (Class<SingletonDemo1>) Class.forName("DesignPatterns.SingletonDemo.ehan.SingletonDemo1");
        Constructor<SingletonDemo1> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonDemo1 a =c.newInstance();
        SingletonDemo1 b =c.newInstance();
        System.out.println(a == b);
    }
}
