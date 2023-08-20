package com.example;

import java.util.Scanner;

public class AppScanner {


    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o cpf");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a Cidade");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite a renda");
        cliente.setRenda(scanner.nextDouble());

        System.out.println("Digite o ano de nascimento");
        cliente.setAnoNascimento(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Digite o sexo");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        


        

        

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("anoNascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente Especial: " + cliente.isEspecial());
        System.out.println();

        

        

        

    }
    
}
