package DesignPatterns.ProxyDemo.StaticProxy;

public class Client {
    public static void main(String[] args) {
        AbstractRole realRole = new RealRole();
        AbstractRole proxyRole = new ProxyRole(realRole);
        proxyRole.step1();
        proxyRole.step2();
        proxyRole.step3();
    }
}
