package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Verdura banana = new Banana();
        Verdura manzana = new Manzana();
        Verdura naranja = new Naranaja();
        Verdura frutilla = new Frutilla();
        Verdura pera = new Pera();
        Verdura mandarina = new Mandarina();
        int opcion = 0;
        double subtotal = 0;
        double iva = 1.21;
        boolean salir = false;
        while (!salir) {

            System.out.println("--------Listado de precios--------");
            System.out.println("  Opcion    Producto        Precio");
            mostrarProductos("1",banana);
            mostrarProductos("2",manzana);
            mostrarProductos("3",naranja);
            mostrarProductos("4",frutilla);
            mostrarProductos("5",pera);
            mostrarProductos("6",mandarina);
            System.out.println("7 Finalizar compra.");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    imprimir(banana.getNombre());
                    subtotal = subtotal + banana.getPrecio();
                    break;
                case 2:
                    imprimir(manzana.getNombre());
                    subtotal = subtotal + manzana.getPrecio();
                    break;
                case 3:
                    imprimir(naranja.getNombre());
                    subtotal = subtotal + naranja.getPrecio();
                    break;
                case 4:
                    imprimir(frutilla.getNombre());
                    subtotal = subtotal + frutilla.getPrecio();
                    break;
                case 5:
                    imprimir(pera.getNombre());
                    subtotal = subtotal + pera.getPrecio();
                    break;
                case 6:
                    imprimir(mandarina.getNombre());
                    subtotal = subtotal + mandarina.getPrecio();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Usted finalizo la compra.");
                    System.out.println("Subtotal: " + subtotal);
                    System.out.println("total " + subtotal * iva);
                    break;
                default:
                    System.out.println("Opcion incorrecta" +
                            "\n Opcion del 1 al 7");

            }
        }
    }

    private static void imprimir(String verdura) {
        System.out.println("Se agrego al carrito: " + verdura);
    }
    private static void mostrarProductos(String opcion,Verdura verdura){
        System.out.println(opcion +" \t\t"+ verdura.getNombre() + "\t\t $ "+ verdura.getPrecio() + " Kg ");
    }
}