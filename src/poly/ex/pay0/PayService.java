package poly.ex.pay0;

public class PayService {

    private Pay pay;
    private Payfind payfind;
    //세터가 없는 경우 생성자 해줘야지 nullexception 난다잉

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void  processPay(String option, int amount){
        System.out.println("결제를 시작합니다: option= " +option +", amount= " +amount);

        setPay(payfind.payFind(option));

        if (pay.pay(amount)) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
