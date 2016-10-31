/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author SyBye8898
 */
public class Car extends Vehicle {
    //same as vehicle
    @Override
    public double getDistance(double litres){
        double kilometers;
        kilometers = litres/9.4*100;
        return kilometers;
    }
    
}
