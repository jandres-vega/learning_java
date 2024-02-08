package com.poo.herencia_01;
import java.util.Date;

public class Cliente extends Persona{
    private int idCLiente;
    private Date fechaREgistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, int edad, char genero, String direccion, Date fechaREgistro, boolean vip) {
        super(nombre, edad, genero, direccion);
        this.idCLiente = ++Cliente.contadorCliente;
        this.fechaREgistro = fechaREgistro;
        this.vip = vip;
    }

    public int getIdCLiente() {
        return idCLiente;
    }

    public Date getFechaREgistro() {
        return fechaREgistro;
    }

    public void setFechaREgistro(Date fechaREgistro) {
        this.fechaREgistro = fechaREgistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Cliente= " + super.toString() +
                "idCLiente=" + idCLiente +
                ", fechaREgistro=" + fechaREgistro +
                ", vip=" + vip +
                '}';
    }
}
