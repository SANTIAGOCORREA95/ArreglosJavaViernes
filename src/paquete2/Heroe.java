/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author 503
 */
public class Heroe {
    
    //datos = atributos = variables
    public String nombre;
    public int edad;
    
    //METODOS = ACCIONES = 
    public Heroe() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        if(edad>1 && edad<120){
            this.edad=edad;
        
        }else{
            System.out.println("Edad invalida");
        }
        
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
