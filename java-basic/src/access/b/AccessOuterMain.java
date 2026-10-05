package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        //다른 패키지에 있어서 접근 불가
        //data.defaultField = 2;
        //data.publicMethod();

        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }
}
