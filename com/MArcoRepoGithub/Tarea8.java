package com.MArcoRepoGithub;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tarea8 {
    public static void main(String[] args) {

        String fileIn = "input.txt";
        String fileOut = "output.txt";
        copyFile(fileIn, fileOut);
    }

    public static void copyFile(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte []datos=in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        }catch (Exception e) {
            System.out.println("El error: " + e.getMessage());
        }
    }
}
