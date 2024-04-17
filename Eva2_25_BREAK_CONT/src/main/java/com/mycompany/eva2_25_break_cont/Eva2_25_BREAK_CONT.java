/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_break_cont;

/**
 *
 * @author diegd
 */
public class Eva2_25_BREAK_CONT {

    public static void main(String[] args) {
    for (int i = 0; i < 100; i++){
        int mod = i % 2;
        if(mod != 0)//queremos los casos que sean pares
            continue;
        
        System.out.println(i);
       }
    for (int i = 0; i < 100; i++){
        int mod = i % 2;
        if(mod == 0)// para que sea puro impares
            continue;
        System.out.println(i);
    }
        System.out.println("BREAK: >>>>>>>>>>>>>>>");
        for (int i = 0; i < 100; i++){
            System.out.print(i);
            if(i == 50)
                break;
        }
    }
}