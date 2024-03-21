/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_3_IF {

     public static void main(String[] args) {
     double califa;
     Scanner captu = new Scanner(System.in);
     califa = captu.nextDouble();
     if(califa >= 70)//esta aeccion --> true
        //{} opcionales, solo cuando tenemos más
        //de una instrucción
        System.out.println("Lo lograste");
     else//la evaluacion false es opcional
     System.out.println("Game Over");
    }
}
