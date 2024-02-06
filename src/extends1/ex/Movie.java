package extends1.ex;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor){
        super(name, price);
        this.actor = actor;
        this.director = director;
    }

    public void print(){
        System.out.println("이름: "+ super.name + ", 가격:" + super.price);
        System.out.println("- 감독:"+this.director + ", 배우: " +this.actor);
    }

    public final void print1(String a){
        System.out.println("a =" + a);
    }

    public final void print1(String a, String b){
        System.out.println("a =" + a + ", b=" + b);
    }
}
