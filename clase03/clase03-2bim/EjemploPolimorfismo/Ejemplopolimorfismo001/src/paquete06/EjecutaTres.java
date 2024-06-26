/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author romer
 */
public class EjecutaTres {

    public static void main(String[] args) {
        String ap = "Elizalde";
        String nom = "Rene";
        EstudianteDistancia e = new EstudianteDistancia(5,10,nom, ap);
        e.establecerIdentificacionEstudiante("1929199191");
        e.establecerEdadEstudiante(40);
        e.calcularMatricula();
        
        System.out.printf("%s\n",e);
    }
}
