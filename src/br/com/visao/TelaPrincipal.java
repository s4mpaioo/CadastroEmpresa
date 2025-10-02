package br.com.visao;

import br.com.controller.Empresa;
import br.com.controle.model.Funcionario;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TelaPrincipal {
    public static void main(String[] args) {
        Funcionario funcionario;
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        boolean funcionarioCadastrado = false;

        int opcao;

        do {
            System.out.println("\n---| MENU |---");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Consultar Funcionário");
            System.out.println("3 - Promover Funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite um número.");
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("---| CADASTRO DE FUNCIONÁRIO |---");

                    String nome;
                    do {
                        System.out.print("Digite o Nome: ");
                        nome = scanner.nextLine();
                        if (!nome.matches("[A-Za-zÀ-ÿ\\s]+")) {
                            System.out.println("Nome inválido. Digite apenas letras.");
                        }
                    } while (!nome.matches("[A-Za-zÀ-ÿ\\s]+"));

                    String cargo = "";
                    int opcaoCargo;
                    do {
                        System.out.println("Escolha o cargo:");
                        System.out.println("1 - Gerente");
                        System.out.println("2 - Funcionário");
                        System.out.print("Opção: ");
                        try {
                            opcaoCargo = Integer.parseInt(scanner.nextLine());
                            switch (opcaoCargo) {
                                case 1 -> cargo = "Gerente";
                                case 2 -> cargo = "Funcionário";
                                default -> System.out.println("Opção inválida. Tente novamente.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Digite um número válido.");
                            opcaoCargo = 0;
                        }
                    } while (cargo.isEmpty());

                    String dataEntrada;
                    do {
                        System.out.print("Digite a data de entrada (dd/mm/aaaa): ");
                        dataEntrada = scanner.nextLine();
                        if (!dataEntrada.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            System.out.println("Data inválida. Use o formato dd/mm/aaaa.");
                        }
                    } while (!dataEntrada.matches("\\d{2}/\\d{2}/\\d{4}"));

                    double salario = -1;
                    do {
                        System.out.print("Digite o salário: ");
                        try {
                            salario = Double.parseDouble(scanner.nextLine());
                            if (salario <= 0) {
                                System.out.println("Salário inválido. Deve ser positivo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Digite um número válido.");
                        }
                    } while (salario < 0);

                    empresa.cadastrarFuncionario(nome, cargo, dataEntrada, salario);
                    funcionarioCadastrado = true;
                }

                case 2 -> {
                    System.out.println("---| Consultando Funcionário |---");
                    if (funcionarioCadastrado) {
                        empresa.consultarFuncionario();
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                }

                case 3 -> {
                    System.out.println("---| Promovendo Funcionário |---");
                    if (funcionarioCadastrado) {
                        empresa.promoverFuncionario();
                    } else {
                        System.out.println("Não é possível promover, nenhum funcionário cadastrado.");
                    }
                }

                case 0 -> System.out.println("Encerrando o programa.");

                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}



        //System.out.println("---| Consultando Funcionário |---");
        //empresa.consultarFuncionario();

        //System.out.println("---| Promovendo funcionário |---");
        //empresa.promoverFuncionario();