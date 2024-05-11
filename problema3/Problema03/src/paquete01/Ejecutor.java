/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Auto;
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
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("149928391", "Mazda", 2008, 12000);
        auto1.calcularValorMatricula();
        auto2.calcularValorMatricula();
        System.out.printf("%s", auto1);
        System.out.printf("%s", auto2);
    }

}
