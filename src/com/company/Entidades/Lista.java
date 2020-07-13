package com.company.Entidades;

public class Lista {

    private Nodo inicio = null;

    public boolean estaVacia() {

        return inicio == null;
    }

    public void agregar(Nodo nuevoNodo) {
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nuevoNodo;
        }
    }

    public void imprimirLista() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("Valor del producto "+ temp.producto.getNombre());
            temp = temp.next;
        }


    }

    public void imprimirListacodigos() {

        Nodo temp = inicio;

        while (temp != null) {
            String CodigoProducto = temp.producto.getCodigo();
            String digitos = CodigoProducto.substring(29, 32);
            System.out.println("Valor del producto " + digitos);
            temp = temp.next;
        }
    }

    public void buscarproducto(String buscar) {
        int contador = 0;

            Nodo temp = inicio;
            while (temp != null) {
                if (temp.producto.getNombre().toLowerCase().contains(buscar.toLowerCase())) {
                    System.out.println("Codigo del Producto: " + temp.producto.getCodigo() + " " + "Producto: " + temp.producto.getNombre()
                            + " Categoria: " + temp.producto.getCategoria());
                    temp = temp.next;
                    contador++;
                } else {
                    temp = temp.next;
                }
            }
        System.out.println("Se encontraron " + contador + " datos");
        }


}



