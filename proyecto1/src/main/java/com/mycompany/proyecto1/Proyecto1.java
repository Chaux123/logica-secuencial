/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import java.util.Scanner;

/**
 *
 * @author Juan David Chaux
 */
public class Proyecto1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
 {

    {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;
        double perimetro;

        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("\nRESULTADOS");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        sc.close();
    }
}{
    }
    }}
