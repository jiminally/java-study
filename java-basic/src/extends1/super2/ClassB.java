package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); //기본 생성자 생략 가능 -> 부모클래스의 생성자가 파라미터가 없는 기본 생성자면 생략가능
        System.out.println("ClassB 생성자 a = " + a);

    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
