/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_20_FOR_3 {

    public static void main(String[] args) {
    //1. IMPRIMIR UN MENSAJE N CANTIDAD DE VECES
    Scanner captu = new Scanner(System.in);
    String numPre,numPre1 = "";
    int cant;
    int cant1;
    int sum = 0;
        System.out.println("Cual seria tu mensaje?");
        numPre = captu.nextLine();
        System.out.println("Cuantas veces quieres que se repita? ");
        cant = captu.nextInt();
        
       for (int i = 1; i <= cant; i++){
           System.out.println(numPre);
       }
       //Segundo Problema
        System.out.println("Colocar un numero entero");
        cant = captu.nextInt();
        for (int i = 1; i <= cant; i++){
            sum = sum + i;
            System.out.println(sum+" ");
        }
        //Tercer problema
        System.out.println("Coloca el numero de filas deceas colocar");
        cant1 = captu.nextInt();
        for (int i = 1; i <= cant1; i++){//filas
        numPre1 += "*";
        System.out.println(numPre1);
        
    }
  }
}
