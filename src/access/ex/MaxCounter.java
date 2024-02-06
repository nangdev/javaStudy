package access.ex;

public class MaxCounter {
    private int count;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(count + 1 > max){
            System.out.println("최대 값을 초과할 수 없습니다");
        } else{
            count += 1;
        }
    }

    public int getCount(){
        return count;
    }
}
