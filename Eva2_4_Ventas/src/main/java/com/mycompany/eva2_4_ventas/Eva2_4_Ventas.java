/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_4_Ventas {

    public static void main(String[] args) {
     int cantidad, calSaldo;
     Scanner captu = new Scanner(System.in);
     System.out.println("Cuantas piezas deseas comprar?");
     cantidad = captu.nextInt();
     
     if(cantidad > 1000)//Verdadero
         calSaldo = cantidad * 500;
     else         //falso - opcional
         calSaldo = cantidad * 800;
     System.out.println("El saldo es "+calSaldo);
     
    }
}
