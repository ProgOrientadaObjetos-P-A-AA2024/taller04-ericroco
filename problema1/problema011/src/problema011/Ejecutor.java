/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema011;

import paquete02.LiberarNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LiberarNotas l1 = new LiberarNotas("Rene", 10, 10, 9);
        l1.establecerPromedio();
        LiberarNotas l2 = new LiberarNotas("Toledo", 8, 7);
        l2.establecerPromedio();

        System.out.printf("%s\n", l1);
        System.out.printf("%s\n", l2);
        /*
        Dependiendo de la cantidad de datos 
        que enviemos ingresaremos a uno u otro constructor
         */
    }

}
