package ref;

public class MethodChange2 {
    static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서트 호출 전: dataA.value = " + dataA.value); //10
        changeReference(dataA);
        System.out.println("메서트 호출 후: dataA.value = " + dataA.value); //20
    }

    public static void changeReference(Data dataX) {
        dataX.value = 20; //dataA와 같은 객체를 가리킨다. 그곳의 value를 20으로 바꿈
    }
}
