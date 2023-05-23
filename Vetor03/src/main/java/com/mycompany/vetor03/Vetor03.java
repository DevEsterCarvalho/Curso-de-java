/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor03;

import java.util.Arrays;

/**
 *
 * @author ester
 */
public class Vetor03 {
    //for each e vetor em ordem com classe Arrays e método sort

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for (double valor: v){
            System.out.println(valor + " ");
        }
    }
}
