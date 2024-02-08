package com.poo.laboratorio.mundoPc;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    public Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamano){
        this();
        this.tamano = tamano;
        this.marca = marca;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", tamano=").append(tamano);
        sb.append(", contadorMonitores=").append(contadorMonitores);
        sb.append('}');
        return sb.toString();
    }
}
