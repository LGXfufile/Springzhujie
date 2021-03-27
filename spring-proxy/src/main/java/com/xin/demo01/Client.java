package main.java.com.xin.demo01;

public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        //中介可以帮房东租房子，还可以做一些附属操作；
        //客户不用面对房东，可以直接找中介即可；
        proxy.rent();
        proxy.fee();
        proxy.seeHouse();
    }
}
