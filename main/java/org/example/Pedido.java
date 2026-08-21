package org.example;

public class Pedido {

    private int id;
    private String cliente;
    private String producto;
    private int cantidad;
    private double precio;

    public Pedido(int id, String cliente, String producto, int cantidad, double precio) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public String getCliente() {
        return cliente;
    }
    public String getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public double calcularTotal() {
        return cantidad * precio;
    }
    @Override
    public String toString() {
        return "Pedido #" + id +
                " | Cliente: " + cliente +
                " | Producto: " + producto +
                " | Cantidad: " + cantidad +
                " | Total: $" + calcularTotal();
    }
}