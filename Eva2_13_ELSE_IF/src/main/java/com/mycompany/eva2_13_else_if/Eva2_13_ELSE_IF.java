/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_13_ELSE_IF {

    public static void main(String[] args) {
     int dia;
     Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia de la semana en numero (1 - 7):");
        dia = captu.nextInt();
        
        if(dia == 1) //Si hay mas de 1 intruccion, poner llaves{}
        System.out.println("Domingo");
        else if(dia == 2)
            System.out.println("Lunes");
        else if(dia == 3)
            System.out.println("Martes");
        else if(dia == 4)
            System.out.println("Miercoles");
        else if(dia == 5)
            System.out.println("Jueves");
        else if(dia == 6)
            System.out.println("Viernes");
        else if(dia == 7)
            System.out.println("Sabado");
        else
            System.out.println("El numero no es un dia valido");
    }
}
