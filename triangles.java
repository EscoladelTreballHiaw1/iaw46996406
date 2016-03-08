/*
 * triangles.java
 * 
 * Copyright 2016 Axel Hermo <axel.hermo@hotmail.com>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package Practiques;

/*
 * motlle de un triangle
 * 
 * el motlle del triangle tindra tres atributs, side1: nombre real amb la longitud del primer costat del triangle,
 * side2: nombre real amb la longitud del segon costat del triangle i side3: nombre real amb la longitud del tercer costat del triangle
 * 
 */

public class triangles {
    
    //primer costat del triangle
    private double side1;
    //segon costat del triangle
    private double side2;
    //tercer costat del triangle
    private double side3;
    
    
    //constructor del triangle per defecte
    public triangles() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    //constructor amb tots els atributs
    public triangles(double side1, double side2, double alcada3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = alcada3;
    }
    //metode que ens calculara el perimetre del triangle
    public double perimetre() {
        double perimetre = this.side1 + this.side2 + this.side3;
        return perimetre;
    }
    public double superficie() {
        double superficie = math.sqrt(((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side3+side1-side2))/4);
        return superficie;
    }
}