package poly.overriding;

import java.security.PrivilegedAction;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("value = " + poly.value);
        poly.method();

        //shift + f6  전체 단어 선택
        // ctrl + y 한줄 삭제
        // ctrl + shift + enter : if, for 괄호 중괄호 자동 완성
        // ctrl + alt + insert : 같은 클래스안에 새로운 자바 클래스 생성




    }
}
