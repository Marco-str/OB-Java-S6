package com.MArcoRepoGithub;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tarea5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Marco");
        arrayList.add("OpenBootcamp");
        arrayList.add("Java");
        arrayList.add("Tarea5");

        for (String name : arrayList){
            System.out.println("ArrayList: " + name);

        }

        LinkedList<String> listaEnlazada = new LinkedList(arrayList);

        for(String names : listaEnlazada){
            System.out.println("LinkedList: " + names);
        }

    }
}
