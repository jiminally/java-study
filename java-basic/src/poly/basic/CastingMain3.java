package poly.basic;

public class CastingMain3 {

    static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 권장함
        Parent parent2 = child; //업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
