/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_califa_eeuu;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class EVA2_14_CALIFA_EEUU {

    public static void main(String[] args) {
    int califa;
    Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion (0 - 100):");
    califa = captu.nextInt();
    
    if(califa >= 90 && califa <= 100) //A
            System.out.println("Sacastes un A");
    else if(califa <= 89 && califa >= 80)//B
            System.out.println("Sacaste un B");
    else if(califa <= 79 && califa >= 70) //C
            System.out.println("Sacaste un C");
    else if(califa <= 69 && califa >= 60) //D
            System.out.println("Sacaste un D");
    else if(califa <= 59 && califa >= 0) //F
            System.out.println("Sacaste un F");
    else
            System.out.println("Calificacion no valida");
    }
}
