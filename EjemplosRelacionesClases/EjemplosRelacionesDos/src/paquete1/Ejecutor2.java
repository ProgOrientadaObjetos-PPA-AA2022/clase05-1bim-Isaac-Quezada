/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author Matias Quezada
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
        //crear un objeto de tipo barrio
        //ingresar por teclado el valor del nombre del barrio
        System.out.println("Ingrese el nombre del barrio? ");
        String nbarrio = entrada.nextLine();
        Barrio b1 = new Barrio(nbarrio);
        
        //crear un objeto de tipo persona
        
        //ingresar por teclado el nombre, cedula

        //asociar al barrio ingresado anteriormente
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el numero de cedula? ");
        String cedula = entrada.nextLine();
        
        
        Persona personaObjeto = new Persona(nombre, cedula, b1);
        //presentar la represntacion del objteto barrio
        System.out.printf("%s\n" , personaObjeto);
    }
}
