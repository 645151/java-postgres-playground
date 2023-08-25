package com.example;

import java.util.Scanner;

public class AppJavaLoop {
    public static void main(String[] args) {
        // TESTE FOR
        int vezes = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de ciclos");
        vezes = scan.nextInt();
        System.out.println();
        for(int cont = 0; cont < vezes; cont ++){
            
        System.out.println(cont + "  Curso Java");
        }
        System.out.println("   fim do loop");
        System.out.println();
    }
    
}
