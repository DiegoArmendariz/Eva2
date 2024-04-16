/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_for;

/**
 *
 * @author diegd
 */
public class Eva1_18_FOR {

    public static void main(String[] args) {
        //     INICIO;  CONDICION; INCREMENTO/DECREMENTO
        for(int i = 1; i <= 10; i++){
            //LLAVES SON OPCIONALES, USELAS CUANDO TENGA MAS DE UNA INTRODUCCION A REPERTIR
            System.out.print(i + " - ");
        }
        System.out.println("");
        for(int i = 10; i >= 1; i--){
            //LLAVES SON OPCIONALES, USELAS CUANDO TENGA MAS DE UNA INTRODUCCION A REPERTIR
            System.out.print(i + " - ");
        }
        //IMPRIMIR LOS NUMEROS PARES ENTRE 0 Y 100
        //0, 2 4 6 8 10
        System.out.println("");
        for(int i = 0; i <= 100; i+=2){
            System.out.print(i + " - ");
        }
    }
}
