package com.MArcoRepoGithub;

import java.util.ArrayList;

public class Tarea6 {
    public static void main(String[] args) {


                ArrayList<Integer> lista = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    lista.add(i);
                    System.out.println(lista.size());
                }

                for (int i = lista.size() - 1; i >= 0; i--) {
                    if (lista.get(i) % 2 == 0) {
                        lista.remove(i);
                    }
                }

                for (int arrayFinal : lista) {
                    System.out.println(arrayFinal);
                }


    }
}
