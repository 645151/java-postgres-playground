package com.example;

import java.util.Scanner;

public class AppJavaLoop3 {
    public static void main(String[] args) {
       

      Scanner scan = new Scanner(System.in);
      System.out.println(" Digite a quantidade de ciclos: ");
      int max  = scan.nextInt();
      int cont = 0;
      do { 
        System.out.println(cont + " JAVANET");
         cont ++;
      }
        while (cont < max); {
            System.out.println("Fim do programa");
        }
          scan.close();  
    }
}   

     

        
    
    

