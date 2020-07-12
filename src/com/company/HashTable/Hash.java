package com.company.HashTable;

import com.company.Producto;
import java.util.ArrayList;

public class Hash {
    private final int tamanio = 4095;
    public ArrayList<HashTableModelo>[] hashtable = new ArrayList [tamanio];

    private ArrayList<HashTableModelo> getObj(int Posicion) {
        if(Posicion >  tamanio)
            return null;
        ArrayList<HashTableModelo> items = hashtable[Math.abs(Posicion)];
        return items;
    }

    public ArrayList<HashTableModelo> get(int Posicion) {
        ArrayList<HashTableModelo> item = getObj(Posicion);
        if(item == null)
            return null;
        else
            return item;
    }

    public void agregar(String key, Producto value){
        int index=Integer.parseInt(key,16);
        ArrayList<HashTableModelo> elements =hashtable[index];
        if(elements == null){
            elements = new ArrayList<HashTableModelo>();
            HashTableModelo hashTableModelo=new HashTableModelo();
            hashTableModelo.setKey(key);
            hashTableModelo.setValue(value);
            elements.add(hashTableModelo);
            hashtable[Math.abs(index)] = elements;
        }else{
            HashTableModelo elemntNew  = new HashTableModelo();
            elemntNew.setKey(key);
            elemntNew.setValue(value);
            for (HashTableModelo element: elements) {
                if (element.getKey().equals(key)){
                    elements.add(element);
                    return;
                }
            }
            HashTableModelo item = new HashTableModelo();
            item.setKey(key);
            item.setValue(value);
            elements.add(item);
        }
    }
}


