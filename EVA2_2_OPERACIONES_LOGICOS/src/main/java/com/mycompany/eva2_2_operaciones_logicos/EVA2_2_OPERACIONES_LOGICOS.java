/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_operaciones_logicos;

/**
 *
 * @author diegd
 */
public class EVA2_2_OPERACIONES_LOGICOS {

    public static void main(String[] args) {
    boolean A , B;
    A = false;
    B = false;
    boolean resu;
    //OPERADOR -> &&
    resu = A && B;
    System.out.println("Resu = " + resu);
    A = true;
    B = false;
    resu = A && B;
    System.out.println("Resu = " + resu);
     A = true;
    B = true;
    resu = A && B;
    System.out.println("Resu = " + resu);
    // operador or
    A = false;
    B = false;
    resu = A || B;
    System.out.println("Resu (or) = " + resu);
    A = false;
    B = true;
    resu = A || B;
    System.out.println("Resu (or) = " + resu);
    //NEGACION --> !
    resu = !A;
    System.out.println("Resu (!) " + resu);
        
    }
}
