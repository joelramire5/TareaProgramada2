package com.company.Logica;

import com.company.Entidades.Lista;
import com.company.Entidades.Nodo;
import com.company.Entidades.Producto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class cargarArchivo {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    public boolean datoscargados=false;
    Producto producto =new Producto();
    Lista milista = new Lista();

    public cargarArchivo(Lista milista){
        this.milista = milista;
    }

    public boolean isDatoscargados(){
        return datoscargados;
    }



public void cargarproductos () throws FileNotFoundException {
    String Flipkart="C:\\Users\\taera\\IdeaProjects\\TareaProgramada2\\src\\com\\company\\Archivos\\flipkart_com-ecommerce_sample.csv";
    Scanner lector = new Scanner (new File(Flipkart));
    int contador=0;
    String currentline=Flipkart;
    while (lector.hasNextLine()){
        currentline=lector.nextLine();

        if(contador!=0) {

            String[] datos = currentline.split(",");
            Producto nuevoProducto = new Producto();
            nuevoProducto.setCodigo(datos[0]);
            nuevoProducto.setNombre(datos[3]);
            nuevoProducto.setCategoria(datos[4]);
            Nodo nuevonodo=new Nodo(nuevoProducto);
            milista.agregar(nuevonodo);
        }
        contador++;
    }
    lector.close();
    datoscargados=true;
    System.out.println("Se han cargado " +contador + " datos");
}

    public void busqueda_por_nombre(){
        if(this.milista.estaVacia()){
            System.out.println("Los datos no se han cargado");
        } else{
            System.out.println("Ingrese el producto que desea encontrar: ");
            this.milista.buscarproducto(input.nextLine());
        }
    }
        public void printcodes(){
            if( this.milista.estaVacia()){
                System.out.println("Los datos no se han cargado");
            } else {
                System.out.println("Ultimos 3 digitos del codigo ");
                this.milista.imprimirListacodigos();
            }

        }
}
