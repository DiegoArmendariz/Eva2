/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_19_For_2 {

    public static void main(String[] args) {
    //PREGUNTAR; CANTIDAD DE ESTUDIANTE EN EL GRUPO
    int numAlum;
    Scanner captu = new Scanner(System.in);
        System.out.println("Cuantos estudiantes tiene el grupo?");
        numAlum = captu.nextInt();
        //hay que capturar todas las calificaciones:
        //for (
        for (int i = 1; i <= numAlum; i++){
            System.out.println("Calificaciones: ");
            int califa = captu.nextInt();
            
        }
    }
}
