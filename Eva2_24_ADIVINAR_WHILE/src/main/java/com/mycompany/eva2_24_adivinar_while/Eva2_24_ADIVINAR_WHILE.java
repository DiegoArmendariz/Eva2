/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_24_ADIVINAR_WHILE {

    public static void main(String[] args) {
    int nume = 5; //numero que tiene que adivinar (entre 1 y 10)
     int valor = 0; //valor para almacenar lo que cature el usuario
     Scanner captu = new Scanner(System.in);
    while(nume != valor){
        System.out.println("Coloque un numero de 1 al 10");
        valor = captu.nextInt(); 
    }
        System.out.println("ADIVINASTE!!");
    }
}
