/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_for_4;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_21_For_4 {

    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int num1;
        System.out.println("Coloca un numero entero");
        num1 = captu.nextInt();
        for (int i = 0; i <= num1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = num1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
