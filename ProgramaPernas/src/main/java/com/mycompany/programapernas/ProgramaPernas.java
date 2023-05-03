/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author ester
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um (a)");
        boolean tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Aranha";
            default -> "ET";
        };
        System.out.println(tipo);
    }
}
