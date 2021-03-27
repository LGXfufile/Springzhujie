package main.java.com.xin.bang.pojo;

public class Client  {
    public static void main(String[] args) {
        //先写真实角色；
        Host host = new Host();
//        代理角色；
        ProxyInvocationHandler proxy = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口对象
        proxy.setRent(host);
        Rent proxy1 = (Rent) proxy.getProxy();
        proxy1.rent();
    }

}
