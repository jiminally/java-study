package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속관계거나 같은 패키지일때인데 상속 관계라서 사용 가능
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가 컴파일 오류

        publicMethod();
        protectedMethod(); //상속관계거나 같은 패키지일때인데 상속 관계라서 사용 가능
        //defaultMethod();
        //privateMethod();

        printParent(); //printParent안에서는 다 호출가능 왜냐면 본인꺼니까
    }
}
