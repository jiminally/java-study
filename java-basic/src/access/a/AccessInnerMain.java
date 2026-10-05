package access.a;

public class AccessInnerMain {

    static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.publicMethod();

        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }
}
