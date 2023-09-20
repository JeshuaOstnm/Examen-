/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_u1._u2;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen_U1_U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura1 = new Scanner(System.in);
        Scanner lectura2 = new Scanner(System.in);
        Scanner lectura3 = new Scanner(System.in);
        
        
        System.out.println("Ingresa el nombre del instrumento 1");
        String nombre = lectura1.nextLine();
        System.out.println("Ingresa el precio de compra del instrumento 1");
        double precioCompra1 = lectura1.nextDouble();
        
        System.out.println("Ingresa el nombre del instrumento 2");
        String nombre2 = lectura2.nextLine();
        System.out.println("Ingresa el precio de compra del instrumento 2");
        double precioCompra2 = lectura2.nextDouble();
        
        System.out.println("Ingresa el nombre del instrumento 3");
        String nombre3 = lectura3.nextLine();
        System.out.println("Ingresa el precio de compra del instrumento 3");
        double precioCompra3 = lectura3.nextDouble();
       
       
        double instrumento1 = 1250.45;
        double instrumento2 = 3743.00;
        double instrumento3 = 2683.78;
        
        double ganancia1 = instrumento1 - precioCompra1;
 
        double ganancia2 = instrumento2 - precioCompra2;
        
        double ganancia3 = instrumento3 - precioCompra3;
        
        System.out.println("********************************************************");
        System.out.println("El porcentaje de ganancia de " + nombre + " es " + (ganancia1/precioCompra1) * 100);
        System.out.println("El porcentaje de ganancia de " + nombre2 + " es " + (ganancia2/precioCompra2) * 100);
        System.out.println("El porcentaje de ganancia de " + nombre3 + " es " + (ganancia3/precioCompra3) * 100);
        System.out.println("********************************************************");
        
        lectura1.close();
        lectura2.close();
        lectura3.close();
    }
    
}
