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
public abstract class Vehicle {
    
    /**
     * takes in a double, returns double
     * pre: takes in a double that is L
     * post: returns double for km
     */
    public abstract double getDistance(double litres);
    
}
