/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author caria
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("pepo");
        int numero = 0;
       
       Scanner scanner = new Scanner(System.in);
       

        do {
            System.out.print("Introdueix un número entre 1 i 10: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("El número ha d'estar entre 1 i 10.");
            }
        } while (numero < 1 || numero > 10);

        System.out.println("Taula de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultat = numero * i;
            System.out.println(numero + " x " + i + " = " + resultat);
    }
}
}
