/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoresaritmeticos;

/**
 *
 * @author ester
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //ex de operadores aritmeticos
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/ 2;
        System.out.println("A média é igual a " + media);*/
        
        //ex de operadores unário
        /*int numero = 10;
        int valor= 4 + numero++;
        System.out.println(valor);
        System.out.println(numero);*/
        
        //ex de operadores de atribuição
        /*int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);*/
       
        //arredondando pra cima
        /*float v = 8.3f;
        int ar = (int) Math.ceil(v);
        System.out.println(ar);*/
        
        //gerador de numeros entre 0 e 1, função random ou de onde vc quiser, como abaixo
        //variavel "ale" de aleatorio
        double ale = Math.random();
        int n = (int) (15 + ale * (50-15));
        System.out.println(n);
       
    }
}
