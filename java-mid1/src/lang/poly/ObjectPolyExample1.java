package lang.poly;

public class ObjectPolyExample1 {

    static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {

        // object.sound();
        // object.move(); //컴파일 오류, 오브젝트는 사운드가 없다

        //객체에 맞는 다운캐스팅 필요
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
