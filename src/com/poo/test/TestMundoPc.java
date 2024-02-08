package com.poo.test;
import com.poo.laboratorio.mundoPc.*;

public class TestMundoPc {
    public static void main(String[] args) {

        Monitor mon1 = new Monitor("HP", 15);
        Monitor mon2 = new Monitor("ACER", 21);
        Monitor mon3 = new Monitor("JANUS", 27);

        Teclado tec1 = new Teclado("Usb", "HP");
        Teclado tec2 = new Teclado("pS2", "ACER");
        Teclado tec3 = new Teclado("pS2", "ACER");

        Raton rat1 = new Raton("Usb", "HP");
        Raton rat2 = new Raton("pS2", "ACER");
        Raton rat3 = new Raton("pS2", "ACER");

        Computadora com1 = new Computadora("Computador 1", mon1, tec1, rat1);
        Computadora com2 = new Computadora("Computador 2", mon2, tec2, rat2);
        Computadora com3 = new Computadora("Computador 3", mon3, tec3, rat3);

        Orden orden1 = new Orden();

        orden1.agregarComputadora(com1);
        orden1.agregarComputadora(com2);
        orden1.agregarComputadora(com3);
        orden1.mostrarOrden();
    }
}
