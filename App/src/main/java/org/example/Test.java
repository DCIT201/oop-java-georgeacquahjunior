package org.example;

public class Test {
        public static void main(String[] args) {
            // Create vehicles
            Vehicle car = new Car("C001", "Sedan", 50.0, true, 4);
            Vehicle motorcycle = new Motorcycle("M001", "Sport Bike", 30.0, false, true);
            Vehicle truck = new Truck("T001", "Freightliner", 100.0, true, 5.0);

            // Print details and calculate rental costs
            System.out.println(car);
            System.out.println("Rental Cost for 5 days: $" + car.calculateRentalCost(5));

            System.out.println(motorcycle);
            System.out.println("Rental Cost for 10 days: $" + motorcycle.calculateRentalCost(10));

            System.out.println(truck);
            System.out.println("Rental Cost for 3 days: $" + truck.calculateRentalCost(3));
        }
    }


