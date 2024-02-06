package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        int total = 0;
        ProductOrder po1 = new ProductOrder();
        po1.name = "두부";
        po1.price = 2000;
        po1.quantity = 2;

        ProductOrder po2 = new ProductOrder();
        po2.name = "김치";
        po2.price = 5000;
        po2.quantity = 1;

        ProductOrder po3 = new ProductOrder();
        po3.name = "콜라";
        po3.price = 1500;
        po3.quantity = 2;

        ProductOrder[] orders = {po1, po2, po3};

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.name + ", 가격: " + order.price + ", 수량: "+order.quantity);
            total += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }
}
