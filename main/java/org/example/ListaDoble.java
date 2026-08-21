package org.example;

public class ListaDoble {

    private NodoDoble cabeza;
    private NodoDoble cola;

    public ListaDoble() {
        cabeza = null;
        cola = null;
    }
    // Insertar al final
    public void insertar(Pedido pedido) {

        NodoDoble nuevo = new NodoDoble(pedido);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            return;
        }
        cola.siguiente = nuevo;
        nuevo.anterior = cola;
        cola = nuevo;
    }
    // Mostrar desde el inicio hacia el final
    public void mostrarAdelante() {
        if (cabeza == null) {
            System.out.println("El historial está vacío.");
            return;
        }
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.println(actual.pedido);
            actual = actual.siguiente;
        }
    }
    // Mostrar desde el final hacia el inicio
    public void mostrarAtras() {
        if (cola == null) {
            System.out.println("El historial está vacío.");
            return;
        }

        NodoDoble actual = cola;
        while (actual != null) {
            System.out.println(actual.pedido);
            actual = actual.anterior;
        }
    }
    // Buscar un pedido
    public Pedido buscar(int id) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.pedido.getId() == id) {
                return actual.pedido;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}