package br.com.controller;
import br.com.controle.model.Funcionario;

public class Empresa {
    private Funcionario funcionario;

    public void cadastrarFuncionario(String nome, String cargo, String dataEntrada, double salario) {
        funcionario = new Funcionario(nome, cargo, dataEntrada, salario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }


    public void promoverFuncionario(){
        if(funcionario != null){
            funcionario.promoverGerente();
        } else {
            System.out.println("Nenhum funcionário cadastrado.");
        }
    }
    public void consultarFuncionario(){
        if(funcionario != null) {
            funcionario.exibir();
        } else {
            System.out.println("Nenhum funcionário cadastrado.");
        }
    }
}
