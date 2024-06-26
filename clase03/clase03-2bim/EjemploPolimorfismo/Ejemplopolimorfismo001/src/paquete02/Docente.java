/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

public abstract class Docente {
    private String nombre;
    private double sueldo;
    
    public Docente(String n){
        nombre = n;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    /*public abstract void obtenerSueldo(double d){
        sueldo = d;
    }*/
    
    public abstract void obtenerSueldo();//metodo abstracto no puede tener cuerpo
    
    
}
