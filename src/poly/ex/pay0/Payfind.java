package poly.ex.pay0;

public abstract class Payfind {
    // 이런 클래스는 객체 생성이 되면 안되잖아 추상클래스로 만들어야지
    // 밑에 메서드도 정적(클래스) 메서드로 선언해서 그냥 사용하게 끔
    public static Pay payFind(String option){
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new Naverpay();
        }
        else{
            return new DefaultPay();
        }
    }
}
