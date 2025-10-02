package br.com.controle.model;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private String cargo;
    private String dataEntrada;
    private double salario;

    public Funcionario(String nome, String cargo, String dataEntrada, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataEntrada = dataEntrada;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDataEntrada(){
        return dataEntrada;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido.");
        }
    }

    public static boolean validarData(String data) {
        return data.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean validarSalario(double salario) {
        return salario >= 0;
    }


    public void promoverGerente() {
        if (cargo.equalsIgnoreCase("Gerente")) {
            System.out.println(nome + " já é Gerente!");
        } else {
            cargo = "Gerente";
            System.out.println(nome + " foi promovido para Gerente!");
        }
    }

    public void exibir() {
        String salarioFormatado = String.format("%.2f", salario);
        System.out.println(
                "\nNome: " + nome +
                "\nCargo: " + cargo +
                "\nData de entrada na empresa: " + dataEntrada +
                "\nSalário: R$ " + salarioFormatado
        );
    }
}
