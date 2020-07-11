package com.company.Entidades;

import com.company.HashTable.Hash;
import com.company.Producto;

public class Lista {

    private Producto inicio = null;

    public boolean estaVacia() {

        return inicio == null;
    }

    public void agregar(Producto nuevoNodo) {
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Producto temp = inicio;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nuevoNodo;
        }
    }

    public void imprimirLista() {
        Producto temp = inicio;
        while (temp != null) {
            System.out.println("Valor del producto " + temp.getCodigo() + " " + temp.getNombre() + " " + temp.getCategoria());
            temp = temp.next;
        }


    }

    public void imprimirListacodigos() {

        Producto temp = inicio;

        while (temp != null) {
            String CodigoProducto = temp.getCodigo();
            String digitos = CodigoProducto.substring(29, 32);
            System.out.println("Valor del producto " + digitos);
            temp = temp.next;
        }
    }


    public void buscarproducto(String buscar) {
        int contador = 0;

            Producto temp = inicio;
            while (temp != null) {
                if (temp.getNombre().toLowerCase().contains(buscar.toLowerCase())) {
                    System.out.println("Codigo del Producto: " + temp.getCodigo() + " " + "Producto: " + temp.getNombre()
                            + " Categoria: " + temp.getCategoria());
                    temp = temp.next;
                    contador++;
                } else {
                    temp = temp.next;
                }
            }
        System.out.println("Se encontraron " + contador + " datos");
        }


    public void transformardecimal() {
        Producto temp = inicio;
        while (temp != null) {
            String CodigoProducto = temp.getCodigo();
            int digitos = Integer.parseInt(CodigoProducto.substring(29, 32),16);
            temp = temp.next;
            System.out.println(digitos);
        }

    }

}



