/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarragánc.a06.p2;

import java.util.Scanner;

/**
 *
 * @author Carlos Javier Barragán Carrión
 * IMT
 * A01410357
 */
public class SPPCBarragánCA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero = solicitarNumero();
        calcularFactorial(numero);
    }
    
    public static int solicitarNumero(){
        int numero;
        System.out.println("\nBienvenido ");
        System.out.println(" Introduce un numero del cual desea calcular su factorial ");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        if (numero < 1 || numero > 10){
            System.out.println(" *ERROR 505 - Factor fuera de rango*");
            solicitarNumero();
        } else {
            
        }
        return numero;
    }
    
    public static void calcularFactorial(int numero){
        int factorial, contador;
        contador = 1;
        factorial = 1;
        do {
            contador++;
            factorial = factorial*(contador);
        } while (contador < (numero));
        System.out.println("El factorial del numero que ingreso es: " + factorial);
    }
    

    }
    
    
