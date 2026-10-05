package ref;

public class NullMain2 {
    static void main(String[] args) {
        Data data = null;
        data.value = 10; //여기서 nullPointerException 이 생겨서 빠져나감 아래는 수행되지않음
        System.out.println("data = " + data.value);
    }
}
