/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_10_OPERADORES_LOGICOS {

    public static void main(String[] args) {
    double moneda;
    int adivinar;
    Scanner captu = new Scanner(System.in);
        System.out.println("Cara(0) o Cruz(1)?");
        adivinar = captu.nextInt();
      
        moneda = Math.random();
        System.out.println("El valor de moneda = " + moneda);
        
        //0.5 es la mitad del rango, > CARA, menor es CRUZ
        if(moneda > 0.5 && adivinar == 0)
            System.out.println("Adivinaste, es cara!!");
        else
            if(moneda <= 0.5 && adivinar == 1)
                System.out.println("Adivinaste, es cruz!!");
                else
                System.out.println("Perdiste");
        
    }
}
