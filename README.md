# Sistema de Gestão de Saúde

Este é um sistema simples de gestão de saúde desenvolvido em Java, que utiliza conceitos de orientação a objetos, como encapsulamento, herança, polimorfismo e abstração.

## Funcionalidades

O sistema inclui as seguintes classes:

1. **Usuario**: Representa um usuário do sistema com atributos `login` e `senha`.
2. **Paciente**: Representa um paciente com atributos como `identificação`, `nome`, `telefone`, `RG`, `CPF`, `Bairro`, `Estado` e `Data de Nascimento`.
3. **Medico**: Representa um médico com atributos como `identificação`, `CRM`, `nome`, `telefone` e `especialidade`.
4. **Especialidade**: Representa uma especialidade médica com atributos como `identificação`, `código` e `nome`.
5. **Consulta**: Representa uma consulta com atributos como `identificação`, referências ao `médico` e ao `paciente`, `descrição` e `data da consulta`.
6. **ConsultaEspecializada**: Uma classe que herda de `Consulta` e inclui atributos específicos para consultas especializadas, como `código da especialidade` e `nome da especialidade`.

## Como Usar

1. Clone o repositório para sua máquina local.
2. Abra o projeto no Eclipse ou outra IDE Java.
3. Certifique-se de ter o JUnit configurado no projeto para executar os testes.
4. Execute as classes de teste para garantir o bom funcionamento do sistema.

## Colaboradores

- João Victor Rosinhole (RM 97880)
- Gabriel Yanes (RM 550324)
- Vivian Costa (RM 552567)

Sinta-se à vontade para contribuir, reportar problemas ou sugerir melhorias!
