/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author StarMedia
 */
public class Cheques {

    private String nombreC;
    private String nombreB;
    private double valorC;
    private double comiB;

    public Cheques(double x) {
        nombreC = "Daniel Campoverde";
        nombreB= "Banco Pichincha";
        valorC = x;
    }

    public Cheques(String a, String b, double c) {
        nombreC = a;
        nombreB = b;
        valorC = c;
    }

    public void establecerNombreC(String x) {
        nombreC = x;
    }

    public void establecerNombreB(String x) {
        nombreB = x;
    }

    public void establecerValorC(double n) {
        valorC = n;
    }

    public void calcularComiB() {
        comiB = (valorC * 0.003) / 100;
    }

    public String obtenerNombreC() {
        return nombreC;
    }

    public String obtenerNombreB() {
        return nombreB;
    }

    public double obtenerValorC() {
        return valorC;
    }

    public double obtenerComiB() {
        return comiB;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cheque\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\nValor del Cheque: %.2f\n"
                + "Comision del Banco: %.2f\n",
                nombreC,
                nombreB,
                valorC,
                comiB);
        return cadena;
    }
}
