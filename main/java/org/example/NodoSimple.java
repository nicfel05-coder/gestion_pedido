package org.example;

public class NodoSimple {

    Pedido pedido;
    NodoSimple siguiente;

    public NodoSimple(Pedido pedido) {
        this.pedido = pedido;
        this.siguiente = null;
    }
}