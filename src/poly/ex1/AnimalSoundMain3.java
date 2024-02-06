package poly.ex1;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw()};


        //변하지 않는 부분
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // ctrl + alt + m = 코드로 메서드 바로 생성(메서드 추출)


    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
        System.out.println();
    }
}
