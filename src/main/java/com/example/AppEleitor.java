package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1950, 10, 1));
        System.out.println("idade : " + cidadao.idade());
        System.out.println(cidadao.eleitor());
     
    }
    
}
