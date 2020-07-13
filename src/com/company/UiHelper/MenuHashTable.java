package com.company.UiHelper;

import com.company.Entidades.Lista;
import com.company.HashTable.Hash;
import com.company.Logica.cargarArchivo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MenuHashTable {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    Lista milista = new Lista();
    cargarArchivo cargararchivo =new cargarArchivo(milista);
    Hash hash;
    public MenuHashTable(Hash hash) {
        this.hash = hash;
    }
    public void menuprincipal(){

        System.out.println("Estructura de Datos Hash");
        System.out.println("Menu Principal");
        System.out.println("Opcion 1: Cargar Datos");
        System.out.println("Opcion 2: Ingresar la posicion a mostrar")
        System.out.println();;

    }

    public void opcionesmenuhash() throws FileNotFoundException {
        int opcion;

        do {
            this.menuprincipal();
            opcion = input.nextInt();
            input.skip("[\r\n]");

            switch (opcion) {
                case 1:
                    cargararchivo.cargarproductos();
                    milista.cargartresultimosdigitos(this.hash);
                    break;

                case 2:
                    System.out.println("hola");

                default:
                    System.out.println("Ingrese una opcion valida");
            }

        } while (opcion != 2 ) ;
    }
}
