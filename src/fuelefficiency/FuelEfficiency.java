/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import java.util.Scanner;

/**
 *
 * @author SyBye8898
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompt
        System.out.println("Enter a number: ");
        
        double litres = scan.nextDouble();
        
        Vehicle[] vehicles = new Vehicle[4];
        //new vehicles with different types
        vehicles[0] = new Truck();
        vehicles[1] = new Car();
        vehicles[2] = new HybridCar();
        vehicles[3] = new Motorcycle();
        //iterating through each vehicle and printing out its distance
        for(int i = 0; i < vehicles.length; i++){
            System.out.println(vehicles[i].getDistance(litres));
        }
        
        
    }
    
}
