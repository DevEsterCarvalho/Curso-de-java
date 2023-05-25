/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testefuncao01;

/**
 *
 * @author ester
 */
public class TesteFuncao01 {

    /*static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é : " + s);
    }
    
    forma de fazer um método sem retornar um valor (procedimento 
    */
        static int soma (int a, int b){
        int s = a + b;
        return s;
    }
    
    // forma de fazer um método que retorne um valor (função) 
        
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma (5,2);
        System.out.println("A soma é: " + sm);
    }
}
