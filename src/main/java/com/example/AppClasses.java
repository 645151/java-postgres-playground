package com.example;

public class AppClasses {


    public static void main(String[] args) {
        System.out.println("Testando");
        Cliente cliente = new Cliente();
        cliente.setNome("Antonio");
        cliente.setRenda(10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        cliente.setCpf("123456789");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("anoNascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente Especial: " + cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(50000, 'F');
        //cliente2.setRenda(-2000);
        //cliente2.setSexo('F');
        cliente2.setNome("Marta");
        cliente2.setAnoNascimento(2000);
        cliente2.setCpf("12345");
        //cliente2.setEspecial('true');

        

        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("anoNascimento: " + cliente2.getAnoNascimento());
        System.out.println("Cliente Especial: " + cliente2.isEspecial());

        if (cliente.getCpf().equals(cliente2.getCpf()));
            System.out.println(" Cliente 1 e Cliente 2 tem o mesmo CPF");
            else System.out.println("CPFs diferentes");

    }
    
}
