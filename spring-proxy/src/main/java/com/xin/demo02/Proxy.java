package main.java.com.xin.demo02;

public class Proxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");

    }

    @Override
    public void delete() {
        log("delete");

    }

    @Override
    public void update() {
        log("update");

    }

    @Override
    public void query() {
        log("query");

    }
    public void log(String name){
        System.out.println("调用了"+name+"方法");
    }
}
