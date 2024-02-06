package poly.ex5;


public class InterfaceMain {

    public static void main(String[] args) {
        InterfaceAnimal[] animals = {new Dog(), new Cat(), new Caw()};

        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
        System.out.println();
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 울음 소리 테스트 시작");
        animal.move();
        System.out.println("동물 울음 소리 테스트 종료");
        System.out.println();
    }

}
