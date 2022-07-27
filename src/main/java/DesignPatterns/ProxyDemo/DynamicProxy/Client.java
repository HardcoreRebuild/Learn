package DesignPatterns.ProxyDemo.DynamicProxy;

import DesignPatterns.ProxyDemo.StaticProxy.ProxyRole;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        AbstractRole realRole = new RealRole();
        AbstractRoleHandler handler = new AbstractRoleHandler(realRole);
        AbstractRole proxyRole= (AbstractRole)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{AbstractRole.class},handler);
        proxyRole.step3();

    }
}
