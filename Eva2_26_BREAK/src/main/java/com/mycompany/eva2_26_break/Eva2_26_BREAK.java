/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva2_26_BREAK {

    public static void main(String[] args) {
    //VAMOS A GENERAR UN ACCESO POR USUARIO Y CONTRASEÑA
    String usuario, pwd;
    
    String USUARIO = "Admin";
    String PASSWORD = "Admin";
    
    Scanner captu = new Scanner(System.in);
    
    //Como es un control de acceso, debemos preguntar un
    //numero indeterminado de veces, hasta que el usuario
    //y contraseña sean correcta
    while(true){
        System.out.println("Usuario:");
        usuario = captu.nextLine();
        System.out.println("Contraseña:");
        pwd = captu.nextLine();
        if(usuario.equals(USUARIO) && pwd.equals(PASSWORD))
            //usuario correcto
            break;
        else
            System.out.println("Datos Incorrectos");
        //para dejar una nota cuando estan mal los datos
    }
    
        System.out.println("Bienvenido al SISTEMA!!!!");
    }
}
