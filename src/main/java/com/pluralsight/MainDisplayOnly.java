package com.pluralsight;
import java.util.Scanner;

public class MainDisplayOnly {
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[20];

        int numberOfVehicles;

        vehicles[0] = new Vehicle(123454, "PT Cruiser", "Red", "283838",1200);
        vehicles[1] = new Vehicle(223455, "Honda Civic", "Blue", "A12345", 1800);
        vehicles[2] = new Vehicle(323456, "Toyota Camry", "Black", "B67890", 2200);
        vehicles[3] = new Vehicle(423457, "Ford Mustang", "Yellow", "C11223", 3500);
        vehicles[4] = new Vehicle(523458, "Chevrolet Malibu", "White", "D44556", 2000);
        vehicles[5] = new Vehicle(623459, "Nissan Altima", "Gray", "E77889", 2100);
        vehicles[6] = new Vehicle(723460, "Jeep Wrangler", "Green", "F99001", 3000);

        numberOfVehicles = 6;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Vehicle ID   Make / Model        Color       Mileage        Price");
        for(int i = 0; i < numberOfVehicles; i++){
            Vehicle v = vehicles[i];
            System.out.printf("%d %s %s %s %.2f\n" , v.getVehicleId(), v.getMakeModel(), v.getColor(), v.getOdometerReading(), v.getPrice());
            //System.out.print(v);
        }


    }

}
