package static2.ex;

public class Car {
    static private int total;
    private String name;

    public Car(String name){
        this.name = name;
        System.out.println("챠랑 구입, 이름 : " +name);
        total++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " +total);
    }
}
