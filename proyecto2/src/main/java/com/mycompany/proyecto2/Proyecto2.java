/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;

import java.util.Scanner;

/**
 *
 * @author Juan David Chaux
 */
public class Proyecto2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
 {

    {

        Scanner sc = new Scanner(System.in);

        double valorProducto;
        double iva;
        double total;

        System.out.print("Ingrese el valor del producto: ");
        valorProducto = sc.nextDouble();

        iva = valorProducto * 0.19;
        total = valorProducto + iva;

        System.out.println("\nRESULTADOS");
        System.out.println("Valor del producto: $" + valorProducto);
        System.out.println("IVA: $" + iva);
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}
    }
}
