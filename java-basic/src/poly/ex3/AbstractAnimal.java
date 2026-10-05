package poly.ex3;

public abstract class AbstractAnimal {

    //자식이 오버라이딩 하는 용도
    public abstract void sound();

    //자식이 상속받아서 쓰는 용도 오버라이딩해도되고 안해도됨
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
