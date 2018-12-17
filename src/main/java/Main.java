import com.Car.*;
import com.Car.CarObject.CarDoor;

import java.util.Date;


public class Main {

    public static void main(String[] args) {

        //............................
        Car car = new Car(new Date());
        car.addWheels(4);
        car.getWhell().get(1).setLife(0);
        car.getDoor().add(new CarDoor());

        car.addOnePassenger();


        car.printlnCar();
        //.............................................

    }
}
