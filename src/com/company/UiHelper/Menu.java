package com.company.UiHelper;

import com.company.Entidades.Lista;
import com.company.Logica.cargarArchivo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    Lista milista = new Lista();
    cargarArchivo cargararchivo =new cargarArchivo(milista);

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
                        cargararchivo.busqueda_por_nombre();

                    break;

                case 3:
                 cargararchivo.printcodes();
                    break;

                case 4:
                    output.println("El programa ha salido con exito");
                    System.exit(1);

                default:
                    System.out.println("Ingrese una opcion valida");
            }

            } while (opcion != 4 ) ;
        }


    }
