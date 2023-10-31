/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * Cristhian
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double r1;
        double r2;
        int e;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número real: ");
        r1 = teclado.nextDouble();
        System.out.println("Dime otro número real: ");
        r2 = teclado.nextDouble();
        System.out.println("El resultado de la suma de " + r1 + " + " + r2 + " es igual a " + (r1+r2));
        System.out.println("El resultado de la resta de " + r1 + " - " + r2 + " es igual a " + (r1-r2));
        System.out.println("El resultado de la multiplicación de " + r1 + " * " + r2 + " es igual a " + (r1*r2));
        System.out.println("El resultado de la división de " + r1 + " : " + r2 + " es igual a " + (r1/r2));
        System.out.println("Dime un número entero para operar con el primer real: ");
        e = teclado.nextInt();
        System.out.println("El resultado de la multiplicación de " + r1 + " * " + e + " es igual a " + (r1*e));
        System.out.println("El resultado de la división de " + r1 + " : " + e + " es igual a " + (r1/e));
    }   
}
