package access.ex;

public class CounterMain {
    static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment(); //1
        counter.increment(); //2
        counter.increment(); //3
        counter.increment(); //최대값을 초과할 수 없습니다.
        int count = counter.getCount();
        System.out.println(count);
    }
}
