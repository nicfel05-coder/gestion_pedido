package org.example;

public class ListaSimple {

    private NodoSimple cabeza;

    public ListaSimple() {
        cabeza = null;
    }
    public void insertar(Pedido pedido) {
        NodoSimple nuevo = new NodoSimple(pedido);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        NodoSimple actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    public Pedido eliminar(int id) {
        if (cabeza == null) {
            return null;
        }
        if (cabeza.pedido.getId() == id) {
            Pedido pedidoEliminado = cabeza.pedido;
            cabeza = cabeza.siguiente;
            return pedidoEliminado;
        }

        NodoSimple actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.pedido.getId() == id) {
                Pedido pedidoEliminado = actual.siguiente.pedido;
                actual.siguiente = actual.siguiente.siguiente;
                return pedidoEliminado;
            }
            actual = actual.siguiente;
        }
        return null;
    }
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay pedidos pendientes.");
            return;
        }
        NodoSimple actual = cabeza;
        while (actual != null) {
            System.out.println(actual.pedido);
            actual = actual.siguiente;
        }
    }
    public Pedido buscar(int id) {

        NodoSimple actual = cabeza;
        while (actual != null) {
            if (actual.pedido.getId() == id) {
                return actual.pedido;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}