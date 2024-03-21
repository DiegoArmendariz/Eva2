/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_15_COMPARAR_TEXTO {

    public static void main(String[] args) {
    // COMPARAR TEXTO EN JAVA
    String dia;
    Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia (Lunes, Martes, etc)");
        dia = captu.nextLine();
        
        if( dia.equals("Domingo")) //no podemos comparar cadenas
            System.out.println("1");
        else if(dia.equals("Lunes"))
            System.out.println("2");
        else if(dia.equals("Martes"))
            System.out.println("3");
        else if(dia.equals("Miercoles"))
            System.out.println("4");
        else if(dia.equals("Jueves"))
            System.out.println("5");
        else if(dia.equals("Viernes"))
            System.out.println("6");
        else if(dia.equals("Sabado"))
            System.out.println("7");
        else
            System.out.println("Otro dia");
    }
}
