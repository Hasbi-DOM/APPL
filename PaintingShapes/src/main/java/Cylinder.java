/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS S410UN
 */
public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder (double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }
    
     public double area() {
        return Math.PI*radius*radius*height;
    }
}
