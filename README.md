#  Cadastro de Funcionários - Via Terminal 

Sistema simples de cadastro de funcionários desenvolvido em Java, com interface via terminal.  
Feito com intuito de praticar estruturas de controle, entrada de dados, validações e manipulação de classes.

---
## 📌 Observações
Em breve, pretendo atualizar o projeto para permitir o cadastro de vários funcionários usando listas, além de melhorar a consulta e promoção individual. Essas mudanças vão deixar o sistema mais completo e próximo de um cenário real.

## Funcionalidades

- Cadastro de funcionário com validação de:
  - Nome (apenas letras)
  - Cargo (via menu interativo)
  - Data de entrada (formato dd/mm/aaaa)
  - Salário (positivo e apenas numérico)
- Consulta dos dados cadastrados
- Promoção de cargo (de Funcionário para Gerente)
- Menu interativo com opções de ação
- Garante que a promoção só ocorra se um funcionário já tiver sido cadastrado anteriormente.

---

## Como executar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```
### 2. Compile os arquivos 
```bash
javac src/br/com/controller/Empresa.java
javac src/br/com/controle/model/Funcionario.java
javac src/br/com/visao/TelaPrincipal.java
```
### 3. Execute o programa
```bash
java -cp src br.com.visao.TelaPrincipal
```

## Requisitos
Java 8 ou superior

Terminal ou IDE (IntelliJ, NetBeans)
