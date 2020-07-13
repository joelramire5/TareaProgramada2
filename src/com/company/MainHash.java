package com.company;

import com.company.HashTable.Hash;
import com.company.UiHelper.Menu;
import com.company.UiHelper.MenuHashTable;

import java.io.FileNotFoundException;

public class MainHash {
    public static void main(String[] args) throws FileNotFoundException {
        Hash hash = new Hash();
        MenuHashTable menuhash =new MenuHashTable(hash);

        menuhash.opcionesmenuhash();


    }
}
