package com.MArcoRepoGithub;

public class Main {
    public static void main(String[] args) {

        String texto = "hola mundo";
        String resultado = reverse(texto);
        System.out.println(resultado);


    }

    public static String reverse(String texto) {
        StringBuilder reversedText = new StringBuilder(texto);
        reversedText.reverse();
        return reversedText.toString();
    }


}

