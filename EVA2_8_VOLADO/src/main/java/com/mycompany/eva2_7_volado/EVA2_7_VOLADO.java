/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_volado;

/**
 *
 * @author diegd
 */
public class EVA2_7_VOLADO {

    public static void main(String[] args) {
        //numero aleatorio en java:
        //valores entre 0 y 1
        //0.556583636475745353
        //0.121212334545457453
    double moneda;
    moneda = Math.random();
    System.out.println("Tu numero es " + moneda);
    
    //0.5 es la mitad del rango
    if(moneda > 0.5)
            System.out.println("CARA");
    else
            System.out.println("CRUZ");
    }
}
