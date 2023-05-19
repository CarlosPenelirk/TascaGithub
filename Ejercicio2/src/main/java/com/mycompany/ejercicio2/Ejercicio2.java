/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author caria
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Taula de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultat = i * j;
                System.out.println(i + " x " + j + " = " + resultat);
            }
        }
    }
}