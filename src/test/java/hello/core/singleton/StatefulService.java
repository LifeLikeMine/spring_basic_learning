package hello.core.singleton;

public class StatefulService {

    // 이렇게 상태가 있으면 안된다.
    private int price;

    public void order(String name, int price){
        System.out.println(name + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
