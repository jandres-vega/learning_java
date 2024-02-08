package com.poo.relacionEntreClases_02.ventas;

public class Orden {

    protected int idOrden;
    protected Producto[] productos;
    private int contadorProductos;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
            productos[this.contadorProductos++] = producto;
        }else {
            System.out.println("Se ha superado el maximo de productos " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id orden: " + this.idOrden);
        System.out.println("Total orden: " + this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos ; i++) {
            System.out.println(this.productos[i].toString());
        }
    }

}
