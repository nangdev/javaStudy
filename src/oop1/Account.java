package oop1;

public class Account {
    int balance;
    void deposit(int amount){
        balance += amount;
        System.out.println(amount+"원이 입금되었습니다");
    }

    void withdraw(int amount){
        System.out.println(amount+"원을 출금하겠습니다");
        if(balance - amount < 0){
            System.out.println("출금 실패 , 잔액 부족");
            System.out.println("잔고: "+balance);
        }
        else{
            balance -= amount;
            System.out.println(amount+"원이 출금되었습니다");
            System.out.println("잔고: "+balance);
        }
    }
}
