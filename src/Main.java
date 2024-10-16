
public class Main {
    public static void main(String[] args) {


        Garage garage = new Garage();

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

       garage.operateVehicle(car);
       garage.operateVehicle(bicycle);
       garage.operateVehicle(boat);


    }
}