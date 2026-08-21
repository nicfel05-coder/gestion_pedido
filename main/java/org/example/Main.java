package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaSimple pedidosPendientes = new ListaSimple();
        ListaDoble historial = new ListaDoble();
        int opcion;
        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEMA DE PEDIDOS");
            System.out.println("       RESTAURANTE");
            System.out.println("=================================");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Mostrar pedidos pendientes");
            System.out.println("3. Atender pedido");
            System.out.println("4. Cancelar pedido");
            System.out.println("5. Mostrar historial");
            System.out.println("6. Buscar pedido");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRAR PEDIDO ---");
                    System.out.print("ID del pedido: ");
                    int id = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Nombre del cliente: ");
                    String cliente = entrada.nextLine();
                    System.out.print("Producto: ");
                    String producto = entrada.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = entrada.nextInt();
                    System.out.print("Precio del producto: ");
                    double precio = entrada.nextDouble();
                    Pedido nuevoPedido =
                            new Pedido(id, cliente, producto, cantidad, precio);
                    pedidosPendientes.insertar(nuevoPedido);
                    System.out.println("Pedido registrado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- PEDIDOS PENDIENTES ---");
                    pedidosPendientes.mostrar();
                    break;

                case 3:
                    System.out.println("\n--- ATENDER PEDIDO ---");
                    System.out.print("Ingrese el ID del pedido: ");
                    int idAtender = entrada.nextInt();
                    Pedido pedidoAtendido =
                            pedidosPendientes.eliminar(idAtender);
                    if (pedidoAtendido != null) {
                        historial.insertar(pedidoAtendido);
                        System.out.println("Pedido atendido correctamente.");
                    } else {
                        System.out.println("No se encontró el pedido.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- CANCELAR PEDIDO ---");
                    System.out.print("Ingrese el ID del pedido: ");
                    int idCancelar = entrada.nextInt();
                    Pedido pedidoCancelado =
                            pedidosPendientes.eliminar(idCancelar);
                    if (pedidoCancelado != null) {
                        System.out.println("Pedido cancelado correctamente.");
                    } else {
                        System.out.println("No se encontró el pedido.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- HISTORIAL DE PEDIDOS ---");
                    historial.mostrarAdelante();
                    break;
                case 6:

                    System.out.println("\n--- BUSCAR PEDIDO ---");
                    System.out.print("Ingrese el ID del pedido: ");
                    int idBuscar = entrada.nextInt();
                    Pedido encontrado = pedidosPendientes.buscar(idBuscar);
                    if (encontrado == null) {
                        encontrado = historial.buscar(idBuscar);
                    }
                    if (encontrado != null) {
                        System.out.println("Pedido encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Pedido no encontrado.");
                    }
                    break;
                case 7:

                    System.out.println("Gracias por utilizar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}