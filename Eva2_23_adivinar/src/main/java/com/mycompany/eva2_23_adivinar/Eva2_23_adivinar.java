/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_23_adivinar {

    public static void main(String[] args) {
     int nume = 5; //numero que tiene que adivinar (entre 1 y 10)
     int valor = 0; //valor para almacenar lo que cature el usuario
     Scanner captu = new Scanner(System.in);
     do{
         System.out.println("Cual es el numero? (Entre 1 y 10)");
         valor = captu.nextInt();
    }while(nume != valor);
        System.out.println("ADIVINASTE!!");
}
}
