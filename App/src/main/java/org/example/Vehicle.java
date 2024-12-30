package org.example;

public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructors with validation
    // Abstract methods for rental calculation
    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable){
        // baseRental should not be less than 0
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Base rental rate must be positive.");
        }

        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    // Getters and Setters method with encapsulation and validation

    // Setter and Getter for vehicleId
    public void setVehicleId(String vehicleId){
        this.vehicleId = vehicleId;
    }
    public String getVehicleId(){
        return vehicleId;
    }

    // Setter and Getter for model
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    // Setter and Getter for setBaseRentalRate
    public void setBaseRentalRate(double baseRentalRate){
        this.baseRentalRate = baseRentalRate;
    }
    public double getBaseRentalRate(){
        return baseRentalRate;
    }

    // Setter and Getter for isAvailable
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    // Abstract methods for rental calculation
    // Abstract method for calculating the rental cost
    public abstract double calculateRentalCost(int days);

    // Abstract method to check if the vehicle is available for rental
    public abstract boolean isAvailableForRental();

    // Overridden toString method for displaying vehicle details
    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model + ", Base Rate: " + baseRentalRate
                + ", Availability: " + (isAvailable ? "Yes" : "No");
    }

}


