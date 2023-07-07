package com.MArcoRepoGithub;

import java.util.Vector;

public class Tarea3 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Marco");
        vector.add("Python");
        vector.add("JavaScript");
        vector.add("OpenBootcamp");
        vector.add("Java");

        System.out.println(vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println(vector);

        /* Tarea 4
       Cuando conocemos la capacidad inicial al crear un vector, es conveniente especificarla en la
        función de inicialización. Esto se debe a que los vectores son estructuras de datos flexibles y,
        cuando alcanzan su capacidad máxima, se crea un nuevo array y se copia el contenido del array anterior.
        Este proceso consume tiempo y recursos, lo que puede ralentizar nuestra aplicación.

        Cuando se alcanza el límite de capacidad, se crea un nuevo array que tiene el doble de espacio que el
        array anterior. Sin embargo, esto puede llevar a reservar una cantidad excesiva de memoria si el límite
        de datos es pequeño. Por ejemplo, si el límite es 1000, estaríamos reservando más memoria de la necesaria.

        Por lo tanto, especificar la capacidad inicial del vector puede ayudarnos a optimizar el rendimiento
        de nuestra aplicación y evitar asignaciones de memoria innecesarias. */
    }
}
