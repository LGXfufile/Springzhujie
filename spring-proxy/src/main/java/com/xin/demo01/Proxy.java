package main.java.com.xin.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent() {
        host.rent();
    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fee(){
        System.out.println("中介收中介费");
    }
}
