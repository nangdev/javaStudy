package ref.Problem;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderNum = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[orderNum];

        String name;
        int price;
        int quantitiy;

        for (int i = 1; i <= orderNum; i++) {
            System.out.println(i+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            name = sc.nextLine();
            System.out.print("가격: ");
            price = sc.nextInt();
            sc.nextLine();
            System.out.print("수량: ");
            quantitiy = sc.nextInt();
            sc.nextLine();

            orders[i-1] = createOrder(name,price,quantitiy);
        }

        printOrders(orders);

        int total = getTotalAmount(orders);

        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.name = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order:orders) {
            System.out.println("상품명: "+order.name+", 가격: "+order.price+", 수량: "+order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder order: orders
             ) {
            total += order.price * order.quantity;
        }
        return total;
    }

}
