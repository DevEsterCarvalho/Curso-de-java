/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contador01;

/**
 *
 * @author ester
 */
public class Contador01 {

    public static void main(String[] args) {
        int cc = 0;
        while (cc <= 10) {
            cc++;
            if (cc == 2 || cc == 7 || cc == 9) {
                continue;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}
