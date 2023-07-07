package com.MArcoRepoGithub;

public class Tarea7 {
    public static void main(String[] args)   {

dividePorCero(5,0);

    }
    public static double dividePorCero(int A, int B) throws ArithmeticException{

    int resultado =0;
    try{
    resultado = A / B;

    }catch(ArithmeticException e){
    System.out.println("Esto no puede hacerse");
    }finally {
    System.out.println("Demo de código");
    }
        return resultado;
    }
}
