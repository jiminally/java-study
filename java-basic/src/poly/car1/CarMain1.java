package poly.car1;

public class CarMain1 {

    static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
