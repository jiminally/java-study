package nested.test;

public class AnonymousMain {
    static void main(String[] args) {
        //여기에서 Hello의 익명 클래스를 생성하고 hello()를 호출하라

        Hello anonymousClass = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.Hello");
            }
        };

        anonymousClass.hello();

    }
}
