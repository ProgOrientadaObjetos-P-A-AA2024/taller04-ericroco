/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author StarMedia
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoFinal;

    public Profesores(String n, String a, String c) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = 1500;
    }

    public Profesores(double sueldo) {
        nombre = "Lenin";
        apellido = "Gonzanamá";
        cedula = "123456778";
        sueldoBasico = sueldo;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void calcularSueldoFinal() {
        sueldoFinal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoFinal() {
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return String.format("Profesor\n"
                + "Nombres %s %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico: %.2f\n",
                nombre,
                apellido,
                cedula,
                sueldoBasico,
                sueldoTotal
        );
    }
}
