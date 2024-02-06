package extends1.ex;

public class Item {
    int price;
    String name;

    protected Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
