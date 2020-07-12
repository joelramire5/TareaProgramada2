package com.company;

import com.company.HashTable.Hash;
import com.company.UiHelper.Menu;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    	Hash hash = new Hash();
    	Menu menu =new Menu(hash);
    	menu.opcionesmenu();
	}
}