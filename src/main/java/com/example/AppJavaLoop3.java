package com.example;

import java.util.Scanner;

public class AppJavaLoop3 {
    public static void main(String[] args) {
        int cont = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println(cont + " Curso de Java");
            cont ++;
        }
        while (cont < 0);
         {
            System.out.println("Fim de programa");
        }
    }
    
}
