package main.java.com.xin.demo02;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        UserServiceImpl userService = new UserServiceImpl();
        proxy.setUserService(userService);
        proxy.add();


    }
}
