/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Cheques;

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
        Cheques cheque1 = new Cheques(200);
        cheque1.calcularComiB();
        Cheques cheque2 = new Cheques("Erick Toledo", "Banco de Loja",
                750);
        cheque2.calcularComiB();

        System.out.printf("%s", cheque1);
        System.out.printf("%s", cheque2);
    }

}
