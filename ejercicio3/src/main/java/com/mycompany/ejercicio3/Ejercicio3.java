/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author caria
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     Scanner scanner = new Scanner(System.in);
        int aprovats = 0;
        int potAprovar = 0;
        int noAprovats = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introdueix la nota " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 4 && nota < 5) {
                potAprovar++;
            } else if (nota >= 5) {
                aprovats++;
            } else {
                noAprovats++;
            }
        }

        System.out.println("Nombre d'alumnes aprovats: " + aprovats);
        System.out.println("Nombre d'alumnes que es poden arribar a aprovar: " + potAprovar);
        System.out.println("Nombre d'alumnes no aprovats: " + noAprovats);
    }
}
