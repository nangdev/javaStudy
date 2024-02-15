package poly.car0;

public class Driver {
    private K3 k3;
    private Model3 model3;

    public void setK3(K3 k3){
        this.k3 = k3;
    }


    // 단축 예약어 : set
    public void setModel3(Model3 model3){
        this.model3 = model3;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        k3.startEngine();
        k3.pressAccelerator();
        k3.offEngine();
    }

}
