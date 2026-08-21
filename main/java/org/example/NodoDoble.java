package org.example;

public class NodoDoble {

    Pedido pedido;
    NodoDoble anterior;
    NodoDoble siguiente;

    public NodoDoble(Pedido pedido) {
        this.pedido = pedido;
        this.anterior = null;
        this.siguiente = null;
    }
}