# Exercício de Programação Orientada a Objetos – Sistema Bancário

Este repositório contém a resolução de um exercício da disciplina de Programação Orientada a Objetos (POO1).

## Proposta do Exercício

Desenvolver um sistema bancário simples capaz de:

- Criar novas contas
- Realizar depósitos
- Realizar saques (sem permitir saldo negativo)
- Consultar dados da conta

Cada conta possui:

- Número identificador
- Saldo
- Cliente titular (nome e CPF)

As contas são armazenadas em uma estrutura `ArrayList`.

## Estrutura do Projeto

- `Banco` – Responsável por gerenciar as contas e executar operações
- `Conta` – Representa a conta bancária
- `TitularConta` – Representa os dados do titular
- `BancoTeste` – Classe principal para execução e testes

## Conceitos Aplicados

- Encapsulamento
- Composição entre classes
- Manipulação de coleções (`List` / `ArrayList`)
- Estruturas condicionais
- Regras de negócio básicas (validação de saldo)
- Organização em múltiplas classes

## Execução

O programa pode ser executado a partir da classe `BancoTeste`.

## Observação

Projeto desenvolvido exclusivamente para fins acadêmicos.
