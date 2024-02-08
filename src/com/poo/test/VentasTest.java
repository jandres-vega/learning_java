package com.poo.test;

import com.poo.relacionEntreClases_02.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("Pantalon", 15.00);
        Producto p2 = new Producto("Chaqueta", 21.00);
        Producto p3 = new Producto("Correa", 17.00);

        Orden o1 = new Orden();

        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p3);

        o1.mostrarOrden();
    }
}
