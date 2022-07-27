package DesignPatterns.ProxyDemo.DynamicProxy;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AbstractRoleHandler implements InvocationHandler {
    AbstractRole abstractRole;

    public AbstractRoleHandler(AbstractRole abstractRole){
        this.abstractRole = abstractRole;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke流程控制");
        Object object = null;
        System.out.println("真实角色方法执行前");
        if(method.getName().equals("step3")){
            object = method.invoke(abstractRole,args);
        }
        System.out.println("真实角色方法执行后");
        return object;
    }
}
