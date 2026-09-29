package PolymorphismTask_CarRental;

public class VehicleRentalTest {

	 // Common rental-processing method
    static void processRental(Vehicle vehicle, int days) {

        vehicle.displayVehicleDetails();

        double totalRent = vehicle.calculateRent(days);

        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: Rs." + totalRent);
        System.out.println("-----------------------------");
    }


    public static void main(String[] args) {

        // Parent class references
        Vehicle v1 = new Car(101, "Hyundai", 2000);
        Vehicle v2 = new Bike(102, "Honda", 800);
        Vehicle v3 = new Truck(103, "Tata", 5000);
        Vehicle v4 = new LuxuryCar(104, "Mercedes", 10000);


        // Vehicle array
        Vehicle[] vehicles = {v1, v2, v3, v4};

        int days = 3;


        // Runtime polymorphism
        for (Vehicle vehicle : vehicles) {

            processRental(vehicle, days);
        }
    }
}
