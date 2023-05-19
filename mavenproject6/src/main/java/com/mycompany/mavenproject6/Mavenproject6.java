/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author caria
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
// Demanar el nombre n per consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el nombre de costats del triangle: ");
        int n = scanner.nextInt();
       
        // Dibuixar el triangle rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

