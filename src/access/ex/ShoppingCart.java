package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= 10){
            System.out.println("장바구니가 가득 찼습니다");
        }
        else{
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems(){
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + TotalPrice());
    }

    private int TotalPrice(){
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total += item.getTotalPrice();
        }
        return total;
    }
}
