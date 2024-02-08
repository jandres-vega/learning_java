package com.poo.test;
import com.poo.herencia_01.Cliente;
import com.poo.herencia_01.Empleado;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Andres", 50.000);

        Cliente cliente = new Cliente("Maria", 20, 'F', "cra52-30", new Date(), true);
        System.out.println("Empleado 1: " + empleado1);
        System.out.println("Cliente 1= " + cliente);
    }
}
