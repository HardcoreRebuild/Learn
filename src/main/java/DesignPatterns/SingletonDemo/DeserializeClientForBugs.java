package DesignPatterns.SingletonDemo;

import DesignPatterns.SingletonDemo.jingtaineibulei.SingletonDemo3;

import java.io.*;

/*
 * 反序列化
 * */
public class DeserializeClientForBugs {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonDemo3 a = SingletonDemo3.getInstance();
        // 序列化
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();
        fos.close();
        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        SingletonDemo3 b = (SingletonDemo3)ois.readObject();
        System.out.println(a == b); // false
    }
}
