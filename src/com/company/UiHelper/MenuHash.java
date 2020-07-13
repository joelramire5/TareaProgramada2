package com.company.UiHelper;

import com.company.HashTable.HashTable;
import com.company.Logica.cargarhashtable;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MenuHash {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    cargarhashtable cargarhash=new cargarhashtable();
    HashTable hashTable=new HashTable(4096);

    public void principal(){
        System.out.println("****HashTable****");
        System.out.println("Seleccione una opcion del siguiente menu: ");
        System.out.println("Opcion 1: Cargar Datos");
        System.out.println("Opcion 2: Buscar Datos");
        System.out.println("Opcion 3: Imprimir Codigos");
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
                   cargarhash.cargarhashtable();
                    break;

                case 2:
                    hashTable.obtener();
                    break;

                case 3:
                  hashTable.mostrarposicion();
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
