package DesignPatterns.ProxyDemo.StaticProxy;

public class ProxyRole implements AbstractRole{

    AbstractRole abstractRole;

    public ProxyRole(AbstractRole abstractRole){
        super();
        this.abstractRole = abstractRole;
    }

    @Override
    public void step1() {
        System.out.println("代理角色-步骤1,代替真实角色执行");
    }

    @Override
    public void step2() {
        System.out.println("代理角色-步骤2,代替真实角色执行");
    }

    @Override
    public void step3() {
        abstractRole.step3();
    }
}
