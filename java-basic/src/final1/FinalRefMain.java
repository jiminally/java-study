package final1;

public class FinalRefMain {
    static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //이미 할당해서 바꿀 수 없다

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
