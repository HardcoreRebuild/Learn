package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        String path = "Reflection.TestObject";
        Class<TestObject> clazz = (Class<TestObject>)Class.forName(path);
        // 通过动态调用构造方法，构造对象
        TestObject test= clazz.newInstance(); // java bean需要无参构造器
        System.out.println(test);
        Constructor<TestObject> c = clazz.getDeclaredConstructor(int.class,String.class);
        TestObject testWithParam = c.newInstance(1,"测试");
        System.out.println(testWithParam.getName());// 有参构造器创建对象
        // 通过反射API调用普通方法
        Method method = clazz.getDeclaredMethod("setName",String.class);
        method.invoke(testWithParam,"反射调用普通方法测试");
        System.out.println(testWithParam.getName());
        // 通过反射API操作属性
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true); // 标记不需要做安全检察，可以直接访问
        f.set(testWithParam,"反射操作属性测试");
        System.out.println(testWithParam.getName());
    }
}
