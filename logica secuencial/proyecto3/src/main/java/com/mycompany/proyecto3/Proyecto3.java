/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto3;

import java.util.Scanner;

/**
 *
 * @author Juan David Chaux
 */
public class Proyecto3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
 {

    {

        Scanner sc = new Scanner(System.in);

        double parcial1;
        double parcial2;
        double proyectoFinal;
        double notaDefinitiva;

        System.out.print("Ingrese la nota del Parcial 1: ");
        parcial1 = sc.nextDouble();

        System.out.print("Ingrese la nota del Parcial 2: ");
        parcial2 = sc.nextDouble();

        System.out.print("Ingrese la nota del Proyecto Final: ");
        proyectoFinal = sc.nextDouble();

        notaDefinitiva = (parcial1 * 0.30) + (parcial2 * 0.30) + (proyectoFinal * 0.40);

        System.out.println("\nLa nota definitiva es: " + notaDefinitiva);

        sc.close();
    }
}
    }
}
