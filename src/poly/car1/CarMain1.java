package poly.car1;


public class CarMain1 {
    public static void main(String[] args){
        Driver driver = new Driver();

        K3 k3 = new K3();
        driver.setCar(k3);

        driver.drive();

        Model3 model3 = new Model3();
        driver.setCar(model3);
        driver.drive();

    }
}
