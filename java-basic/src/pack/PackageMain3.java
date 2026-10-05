package pack;

import pack.a.User;

public class PackageMain3 {
    static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //다른 하나는 다 써줘야한다
    }
}
