    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author ester
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s = 0;
        int t= 0;
        int impar = 0;
        int par = 0;
        int media = 0;
        int acima = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Informe um número: (valor 0 interrompe)"));
        s += n;
        
        t++;
        
        if (n % 2 == 1){
            impar++;
        } else
            par++;
        
        if (n > 100) {
            acima++;
        }
        
        media = t/2;
        
        }while (n != 0 );
        JOptionPane.showInputDialog(null, 
                "<html>Resultado: <br> --------" 
                    + "<br>Somatório vale " + s 
                    + "<br>Total de valores : " + t 
                    + "<br>Total de pares: " + par  
                    + "<br>Total de impares: " + impar  
                    + "<br>Acima de 100: " + acima  
                    + "<br>Média dos valores: " + media
                    + "<html>",
                "Resultado final", JOptionPane.WARNING_MESSAGE);
       
    }
}