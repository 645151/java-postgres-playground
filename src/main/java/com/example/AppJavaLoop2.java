package com.example;

import java.util.Scanner;

public class AppJavaLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite a quantidade de ciclos ");
        int max = scan.nextInt();

        while (cont < max){
            System.out.println(cont + "Curso Java");
            cont ++;
        }
    }
    
}
