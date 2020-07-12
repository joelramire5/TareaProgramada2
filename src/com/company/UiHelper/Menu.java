package com.company.UiHelper;

import com.company.Entidades.Lista;
import com.company.HashTable.Hash;
import com.company.Logica.cargarArchivo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    Lista milista = new Lista();
    cargarArchivo cargararchivo =new cargarArchivo(milista);
    Hash hash;


    public Menu(Hash hash) {
        this.hash = hash;
    }

    public void principal(){
        System.out.println("****Productos****");
        System.out.println("Seleccione una opcion del siguiente menu: ");
        System.out.println("Opcion 1: Cargar Datos");
        System.out.println("Opcion 2: Buscar Datos");
        System.out.println("Opcion 3: Imprimir Codigos");
        System.out.println("Opcion 4: Salir");
    }

    public void opcionesmenu() throws FileNotFoundException {
        int opcion;

        do {
            this.principal();
            opcion = input.nextInt();
            input.skip("[\r\n]");

            switch (opcion) {
                case 1:
                    cargararchivo.cargarproductos();
                    break;

                case 2:
                    if (milista.estaVacia()==true) {
                        cargararchivo.busqueda_por_nombre();
                    } else {
                        System.out.println("Los datos no han sido cargados");
                    }
                    break;

                case 3:
                 cargararchivo.printcodes();
                    break;

                case 4:
                    output.println("El programa ha salido con exito");
                    System.exit(1);
                case 5:
                    if(!milista.estaVacia()){
                        milista.cargartresultimosdigitos(this.hash);
                    }else{
                        System.out.println("lista vacia");
                    }

                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }

            } while (opcion != 7 ) ;
        }


    }
