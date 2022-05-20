package classes;

public class VenicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("car", Vehicle.Type.Car, 15, 80);
        Vehicle truck = new Vehicle("truck", Vehicle.Type.Truck, 35, 50);

        System.out.println(car.time(1000));
        System.out.println(truck.time(1000));
        System.out.println(car.distance_fuel(1000));
        System.out.println(truck.distance_fuel(1000));
        System.out.println("========");
        Vehicle.VehicleInfo(car);
        System.out.println("========");
        Vehicle.VehicleInfo(truck);
    }
}
