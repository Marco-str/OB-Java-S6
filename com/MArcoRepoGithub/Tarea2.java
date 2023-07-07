package com.MArcoRepoGithub;

public class Tarea2 {
    public static void main(String[] args) {

        /**** Tarea 2 ****/

        int arraBidi[][]= {
                {1, 2, 3, 4},
                {10, 20 ,30, 40}
        };
        for ( int i = 0; i < arraBidi.length; i++) {
            System.out.println("La fila i es: " + i);
            for (int j = 0; j < arraBidi[i].length; j++) {
                System.out.println("La columna j es: " + j + " El dato en esa posicion es: " );
                System.out.println( arraBidi[i][j]);
            }
        }

    }
}
