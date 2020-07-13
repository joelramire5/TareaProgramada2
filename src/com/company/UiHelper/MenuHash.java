package com.company.UiHelper;

import com.company.Entidades.Nodo;
import com.company.Entidades.Producto;
import com.company.HashTable.HashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MenuHash {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    private HashTable arraylistproductos = new HashTable(50);
    private boolean datoscargados=false;
    HashTable hashTable=new HashTable(4096);

    public void principal(){
        System.out.println("****HashTable****");
        System.out.println("Seleccione una opcion del siguiente menu: ");
        System.out.println("Opcion 1: Cargar Datos");
        System.out.println("Opcion 2: Buscar Datos");
        System.out.println("Opcion 3: Imprimir Lista con Posiciones");
        System.out.println("Opcion 4: Salir");
    }

    public void opcionesmenuhash() throws FileNotFoundException {
        int opcion;

        do {
            this.principal();
            opcion = input.nextInt();
            input.skip("[\r\n]");

            switch (opcion) {
                case 1:
                   cargarhashtable();
                    break;

                case 2:
                   arraylistproductos.obtener();
                    break;

                case 3:
                 arraylistproductos.mostrarposicion();
                    break;

                case 4:
                    output.println("El programa ha salido con exito");
                    System.exit(1);

                default:
                    System.out.println("Ingrese una opcion valida");
            }

        } while (opcion != 4 ) ;
    }
    public void cargarhashtable () throws FileNotFoundException {
        String Flipkart="C:\\Users\\taera\\IdeaProjects\\TareaProgramada2\\src\\com\\company\\Archivos\\flipkart_com-ecommerce_sample.csv";
        Scanner lector = new Scanner (new File(Flipkart));
        int contador=0;

        while (lector.hasNextLine()){
            String currentline="";
            currentline=lector.nextLine();
            if(contador!=0) {

                String[] datos = currentline.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                Producto nuevoProducto = new Producto();
                nuevoProducto.setCodigo(datos[0]);
                nuevoProducto.setNombre(datos[3]);
                nuevoProducto.setCategoria(datos[4]);
                Nodo nuevonodo = new Nodo(nuevoProducto);
                arraylistproductos.AgregarHash(nuevonodo);
            }
            contador++;
        }
        lector.close();
        datoscargados=true;
        System.out.println("Se han cargado "+ contador+" datos");
    }

}
