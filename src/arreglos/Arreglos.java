/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import paquete2.Heroe;


/**
 *
 * @author 503
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //como se utiliza una clase?
        //CREANDO OBJETO
        
        //QUE ES UN OBJETO
        //UNA VARIABLE
                
                
        Heroe heroe = new Heroe();
        Enemigo enemigo = new Enemigo();
        
        //ACCEDIENDO A ATRIBUTOS
        enemigo.nombre="BORRE";
        heroe.nombre="LUCHO DIAZ";
        
        //ACCEDIENDO A UN ATRIBUTO PRIVADO
        heroe.setEdad(-5);
        
        System.out.println(heroe.nombre);
        System.out.println(heroe.getEdad());
    }
    
}
