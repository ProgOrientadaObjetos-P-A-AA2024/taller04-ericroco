/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.Profesores;
/**
 *
 * @author StarMedia
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesores profesor1 = new Profesores(1270);
                profesor1.calcularSueldoFinal();
        Profesores profesor2 = new Profesores("Arturo", "Gonzales", "1900897971");
        profesor2.calcularSueldoFinal();
        
        System.out.printf("%s",profesor1);
        System.out.printf("%s",profesor2);
    }
    
}
