package org.example;

import java.util.HashMap;
import java.util.Map;

public class Cajero {
    private int id;
    private int dineroDisponible;
    private int numeroTransacciones;
    private String direccion;
    private String nombreBanco;
    private Map<Integer, Integer> billetes = new HashMap<>();
    private int intentos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public int getNumeroTransacciones() {
        return numeroTransacciones;
    }

    public void setNumeroTransacciones(int numeroTransacciones) {
        this.numeroTransacciones = numeroTransacciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public Map<Integer, Integer> getBilletes() {
        return billetes;
    }

    public void setBilletes(Map<Integer, Integer> billetes) {
        this.billetes = billetes;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public Cajero() {
        billetes.put(50000, 10);   // 10 billetes de 50.000
        billetes.put(100000, 20);  // 20 billetes de 100.000
        billetes.put(20000, 15);   // 15 billetes de 20.000
        billetes.put(10000, 5);    // 5 billetes de 10.000

        // Calculamos el dinero disponible
        for (Map.Entry<Integer, Integer> entry : billetes.entrySet()) {
            dineroDisponible += entry.getKey() * entry.getValue();
        }

    }
    public static boolean validaNumeroTarjeta(int numeroTarjeta, int validadNumeroTarjeta){
        boolean validarNum = true;
        if (numeroTarjeta == validadNumeroTarjeta){
            validarNum = false;
        }
        return validarNum;
    }
    public int getDineroDisponible() {
        return dineroDisponible;
    }
}