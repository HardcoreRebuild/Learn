package DesignPatterns.PrototypeDemo;

import java.io.*;
import java.util.Date;

public class client2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 使用序列化和反序列化
        Date date = new Date();
        ShallowCloneObject s = new ShallowCloneObject("原型对象",date);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        ShallowCloneObject deepCloneBySerialization = (ShallowCloneObject)ois.readObject();
        System.out.println(s.getName() + s.getCreateTime());
        System.out.println(deepCloneBySerialization.getName() + deepCloneBySerialization.getCreateTime());
        date.setTime(12121212121212L);
        System.out.println(s.getName() + s.getCreateTime());
        System.out.println(deepCloneBySerialization.getName() + deepCloneBySerialization.getCreateTime());
    }
}
