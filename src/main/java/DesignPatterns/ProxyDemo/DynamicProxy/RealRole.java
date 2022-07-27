package DesignPatterns.ProxyDemo.DynamicProxy;

public class RealRole implements AbstractRole {
    @Override
    public void step1() {
        System.out.println("真实角色-步骤1");
    }

    @Override
    public void step2() {
        System.out.println("真实角色-步骤2");
    }

    @Override
    public void step3() {
        System.out.println("真实角色-步骤3,代理角色没有的方法");
    }
}
