package com.poo.laboratorio.mundoPc;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private int contadorOrdenes;
    private int contadorComputadores;
    private final static int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++this.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        System.out.println("add compu " + this.contadorOrdenes);
        if (this.contadorComputadores< Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadores++] = computadora;
        }
    }

    public void mostrarOrden(){
        System.out.println("************* ORDEN # " + this.idOrden + "*****************");
        for (int i = 0; i < this.contadorComputadores ; i++) {
            System.out.println(this.computadoras[i].toString());
        }
    }
}
