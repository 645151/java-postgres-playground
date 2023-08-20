package com.example;

public class Cliente{
    private String nome;
    private String cpf;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;


    public String getNome() {
    return nome;
}

    public void setNome(String nome) {
    this.nome = nome;
}
    public String getCpf() {
    return cpf;
}

    public void setCpf(String cpf) {
    this.cpf = cpf;
}

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F')
        this.sexo = sexo;
        else System.out.println("Entrada invalida");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

 

    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >=0)
        this.renda = renda;
        else System.out.println("Renda não pode se negativa");
    }
   
    public boolean isEspecial() {
    return especial;
}
    public void setEspecial(boolean especial) {
    this.especial = especial;
} 

    public Cliente(){
    System.out.println("Criando um cliente usando o construtor sem parametro");
    double aleatorio = Math.random();
    if (aleatorio > 0.5)
    especial = true;
}

    public Cliente(double renda,char sexo){
    this();
    System.out.println("Criando um cliente usando o construtor COM parametro");
    setRenda(renda);
    this.sexo = sexo;
    //this.nome;
}
}