/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author StarMedia
 */
public class Auto {
     private String cedulaD;
    private String marca;
    private int fabricationYear;
    private double valorV;
    private double valorM;

    public Auto() {
        cedulaD = "1500021394";
        marca = "Volkswagen";
        fabricationYear = 2018;
        valorV = 26000;
    }

    public Auto(String a, String b, int c, double d) {
        cedulaD= a;
        marca = b;
        fabricationYear = c;
        valorV = d;
    }

    public void establecerCedulaDuenio(String x) {
        cedulaD = x;
    }

    public void establecerMarcaVehiculo(String x) {
        marca = x;
    }

    public void establecerAnioFabricacion(int n) {
        fabricationYear = n;
    }

    public void establecerValorVehiculo(double n) {
        valorV= n;
    }

    public void calcularValorMatricula() {
        valorM = ((valorV * 0.002) / 100) * (2024 - fabricationYear);
    }

    public String obtenerCedulaDuenio() {
        return cedulaD;
    }

    public String obtenerMarcaVehiculo() {
        return marca;
    }

    public int obtenerAbioFabricacion() {
        return fabricationYear;
    }

    public double obtenerValorVehiculo() {
        return valorV;
    }

    public double obtenerValorMatricula() {
        return valorM;
    }

    @Override
    public String toString() {
        String cadena = String.format("Automotor\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de Fabricación: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedulaD,
                marca,
                fabricationYear,
                valorV,
                valorM);
        return cadena;
    }
}
