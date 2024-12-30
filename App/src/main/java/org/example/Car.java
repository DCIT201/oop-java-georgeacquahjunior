package org.example;

import java.util.Objects;

public class Car extends Vehicle implements Rentable {
    private int numberOfSit;

    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, int numberOfSit) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.numberOfSit = numberOfSit;
    }
    public int getNumberOfDoors() {
        return numberOfSit;
    }

    public void setNumberOfDoors(int numberOfSit) {
        this.numberOfSit = numberOfSit;
    }
    public String toString() {
        return super.toString() + ", numberOfSit: " + numberOfSit + "}";
    }


    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public void rent(Customer customer) {
        if (!isAvailable()) {
            System.out.println("Car is not available for rental.");
            return;
        }

        setAvailable(false); // Mark the car as rented
        System.out.println(customer.getName() + " has rented the car model: " + getModel());
    }

    public void returnVehicle() {
        setAvailable(true); // Mark the car as available
        System.out.println("Car model: " + getModel() + " has been returned.");
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        if (!super.equals(o)) return false;
        return getNumberOfDoors() == car.getNumberOfDoors();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfDoors());
    }

    public void setRentalDays(int rentalDays) {
        if (rentalDays < 1) {
            throw new IllegalArgumentException("A car must be rented for at least 1 day.");
        }
        if (rentalDays > 100) {
            throw new IllegalArgumentException("A car cannot be rented for more than 30 days.");
        }
    }
}