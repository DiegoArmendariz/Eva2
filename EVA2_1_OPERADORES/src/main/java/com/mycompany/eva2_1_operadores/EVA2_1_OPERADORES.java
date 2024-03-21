/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_operadores;

/**
 *
 * @author diegd
 */
public class EVA2_1_OPERADORES {

    public static void main(String[] args) {
       //OPERADORES 
       
       int num1, num2;
       num1 = 5;
       num2 = 3;
       int suma = num1 + num2; //operador de suma +
       //Si en el operador + uno de los terminos es
       //cadena, todo se convierte a cadena y se unen 
       //concatenacion: unión de cadenas de texto
       System.out.println("La suma es "+ suma);
       boolean prueba = true;
       System.out.println("El valor de prueba es "+ prueba);
       
       //MULTIPILCACION *
       int multi;
       multi = num1 * num2;
       System.out.println("La multiplicacion es " + multi);
       
       //DIVISION /
       int divi = 7 / 2;
       System.out.println("La division de 7 / 2 es " + divi);
       double diviDouble = 7 / 2.0;
       System.out.println("La division (double) de 7 / 2 es " + diviDouble);
       
       //ACUMULADORES
       //SUMA +=, RESTA -=, MULTI *=, DIVI /=
       int sumatoria = 0;
       /*sumatoria = sumatoria + 90;
       sumatoria = sumatoria + 80;
       sumatoria = sumatoria + 80;*/
       sumatoria += 90;//agrego 90 a sumatoria
       sumatoria += 80;//agrego 80 a sumatoria
       sumatoria += 80;//agrego 80 a sumatoria
       System.out.println("La sumatoria es " + sumatoria);
       sumatoria -= 70;//le resta 70 a sumatoria
       //sumatoria = sumatoria - 70;
       System.out.println("La sumatoria es " + sumatoria);
       //
       int multiAcum = 1;
       multiAcum *= 100;
       System.out.println("Multiacum =" + multiAcum);
       multiAcum *= 5;
       System.out.println("Multiacum =" + multiAcum);
    }
}
