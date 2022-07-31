package MyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("MyAnnotation.TestObject");
            // 获得类的所有有效注解
            Annotation[] annotations =  clazz.getAnnotations();
            for(Annotation a:annotations){
                System.out.println(a);
            }
            // 获得指定注解
            System.out.println(clazz.getAnnotation(TestObjectTable.class));

            // 获得类的属性的注解
            Field f = clazz.getDeclaredField("name");
            TestObjectField testObjectField =  f.getAnnotation(TestObjectField.class);
            System.out.println(testObjectField.columnName());
            System.out.println(testObjectField.type());
            System.out.println(testObjectField.length());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
