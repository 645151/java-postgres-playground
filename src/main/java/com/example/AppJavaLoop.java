package com.example;

import java.util.Scanner;

public class AppJavaLoop {
    public static void main(String[] args) {
        // TESTE FOR
        //5
        //int vezes = 0;
        //Scanner scan = new Scanner(System.in);
       // System.out.println("Digite a quantidade de ciclos");
        //int vezes = scan.nextInt();
       // System.out.println();
        //for(int cont = 0; cont < vezes; cont ++){
            
        //System.out.println(cont + "  Curso Java");
       // }
       // System.out.println("   fim do loop");
       // System.out.println();

       // scan.close();

       Scanner scan = new Scanner(System.in);
       System.out.println("Digite o numero de ciclos");
       int ciclos = scan.nextInt();


       for (int cont = 0; cont < ciclos; cont ++){

        System.out.println(cont + " JAVANIGHT");

        scan.close();
       }
        
    }
    
}
