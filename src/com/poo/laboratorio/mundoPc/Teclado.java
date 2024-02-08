package com.poo.laboratorio.mundoPc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    public String toString() {
        return "Teclado{" +
                "idTeclado='" + idTeclado + '\'' +
                "contador=" + contadorTeclados +
                '}';
    }
}
