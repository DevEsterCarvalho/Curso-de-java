/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoreslogicos;

/**
 *
 * @author ester
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        //testes
        
        /*int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y && y == z)? true:false;
        System.out.println(resultado);*/
        
        /*int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y || y == z)? true:false;
        System.out.println(resultado);*/
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y ^ y == z)? true:false;
        // dessa forma o resultado sera true, caso seja x < y ^ y < z) o resultado será false
        System.out.println(resultado);
        
        
    }
}
