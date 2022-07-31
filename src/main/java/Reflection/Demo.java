package Reflection;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        String path = "Reflection.TestObject";
        // 方法一
        Class clazz = Class.forName(path);
        // 方法二
        Class clazz2 = path.getClass();

        System.out.println(clazz);
        // 一个类只有一个class对象
        System.out.println(clazz == clazz2); // true
        System.out.println(clazz.hashCode());
        System.out.println(clazz.getName());// 获得包名
        System.out.println(clazz.getSimpleName());// 获得类名
        System.out.println(clazz.hashCode());
        System.out.println(clazz.getFields().length);// 只能获得public
        System.out.println(clazz.getDeclaredFields().length);// 获得所有字段
        System.out.println(clazz.getDeclaredField("name"));// 获得所有字段
        System.out.println(clazz.getMethods());// 获得public方法
        System.out.println(clazz.getDeclaredMethod("getName",null));// 获得方法,参数类型区分
        System.out.println(clazz.getDeclaredMethod("setName",String.class));// 获得方法,参数类型区分
        System.out.println(clazz.getDeclaredConstructor(int.class,String.class));// 获得有参构造器
    }
}
