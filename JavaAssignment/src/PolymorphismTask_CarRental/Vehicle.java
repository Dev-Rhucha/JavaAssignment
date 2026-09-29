package PolymorphismTask_CarRental;

class Vehicle {

    int vehicleNo;
    String brand;
    double rentPerDay;

    Vehicle(int vehicleNo, String brand, double rentPerDay) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: Rs." + rentPerDay);
    }
}


// Car
class Car extends Vehicle {

    Car(int vehicleNo, String brand, double rentPerDay) {
        super(vehicleNo, brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {

        double basicRent = rentPerDay * days;
        double insurance = 500;
        double driverCharge = 300 * days;

        return basicRent + insurance + driverCharge;
    }
}


// Bike
class Bike extends Vehicle {

    Bike(int vehicleNo, String brand, double rentPerDay) {
        super(vehicleNo, brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {

        double basicRent = rentPerDay * days;
        double securityCharge = 200;

        return basicRent + securityCharge;
    }
}


// Truck
class Truck extends Vehicle {

    Truck(int vehicleNo, String brand, double rentPerDay) {
        super(vehicleNo, brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {

        double basicRent = rentPerDay * days;
        double driverCharge = 700 * days;
        double securityCharge = 1000;

        return basicRent + driverCharge + securityCharge;
    }
}


// Luxury Car
class LuxuryCar extends Vehicle {

    LuxuryCar(int vehicleNo, String brand, double rentPerDay) {
        super(vehicleNo, brand, rentPerDay);
    }

    @Override
    double calculateRent(int days) {

        double basicRent = rentPerDay * days;
        double insurance = 1500;
        double driverCharge = 1000 * days;
        double seasonalCharge = 2000;

        return basicRent + insurance + driverCharge + seasonalCharge;
    }
}
