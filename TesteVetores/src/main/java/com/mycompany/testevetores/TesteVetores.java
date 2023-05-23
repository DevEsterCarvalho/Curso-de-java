/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testevetores;

/**
 *
 * @author ester
 */
public class TesteVetores {
    
    
    
    public static void main(String[] args) {
    /* forma para atribuir um vetor, quando já se sabe os valores
        int n [] = new int [4];
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;
    */
        int n [] = {3,2,8,7,5,4};
        System.out.print("Total de casas de N" + n.length);
        for(int c = 0; c <= 5; c ++){
            System.out.println("Na posição " + c + "temos o valor " + n[c]);
        
    }
   
 
  
}



