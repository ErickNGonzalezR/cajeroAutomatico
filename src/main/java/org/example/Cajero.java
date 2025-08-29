package org.example;

import java.util.HashMap;
import java.util.Map;

public class Cajero {
    private int id;
    private int dineroDisponible;
    private int numeroTransaccione;
    private String direccion;
    private String nombreBanco;
    private String[] montos = {
            "50.000", "100.000", "200.000",
            "500.000","800.000","Otros valores"};
    private Map<Integer, Integer> billetes = new HashMap<>();
}
