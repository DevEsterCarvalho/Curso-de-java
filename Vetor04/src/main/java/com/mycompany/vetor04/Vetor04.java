/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor04;

import java.util.Arrays;

/**
 *
 * @author ester
 */
public class Vetor04 {

    public static void main(String[] args) {
        //encontrando a posição do vetor (1) com método binarySearch
        //variavel p de posição
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v: vet){
            System.out.println(v);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontrei o valor na posição " + p);
        
    }
}
