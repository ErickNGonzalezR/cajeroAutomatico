package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String contrasenia = "";
        int numeroTarjeta;
        String validarContraseia = "";
        int validarTarjeta;
        boolean onNumertoTarjeta = true;
        Persona persona = new Persona();
        Cajero cajero = new Cajero();

        System.out.println("Bienvenido");
        System.out.println("Por favor digita tu numero de tarjeta");
        numeroTarjeta = sc.nextInt();
        validarTarjeta = persona.getCuenta().getTarjeta().getNumero();
        do {

            onNumertoTarjeta = cajero.validaNumeroTarjeta(numeroTarjeta,validarTarjeta);
            if (onNumertoTarjeta){
                System.out.println("numero de tarjeta incorrecto");
                System.out.println("Por favor digita tu numero de tarjeta");
                numeroTarjeta = sc.nextInt();

            }

        }while (onNumertoTarjeta);

        System.out.println("Por favor digita tu contraseña");

    }
}