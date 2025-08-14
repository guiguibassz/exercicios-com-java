# Projeto 4: Validador de Múltiplos

Este é um programa que testa a compreensão do usuário sobre múltiplos de um número. Ele continua a pedir números até que um valor que **não** seja um múltiplo do número inicial seja inserido.

## Objetivo

O objetivo deste exercício é praticar o uso de laços de repetição controlados por uma condição específica (`while` ou `do-while`) e o operador de módulo (`%`) para verificar a divisibilidade.

## Como Funciona

1.  O programa primeiro solicita ao usuário um **número inicial** que servirá como base para a verificação.
2.  Em seguida, ele entra em um laço infinito ou condicional, solicitando que o usuário insira outros números.
3.  Para cada número inserido, o programa realiza duas verificações:
    *   Ignora o número se ele for menor que o número inicial.
    *   Verifica se o número é um múltiplo do número inicial (ou seja, se `numero % numero_inicial == 0`).
4.  O laço continua enquanto os números inseridos forem múltiplos do número inicial.
5.  A execução termina quando o usuário digita um número que, ao ser dividido pelo número inicial, deixa um resto diferente de zero.

## Exemplo de Uso

-   **Número inicial**: `10`
-   **Entradas seguintes**: `20`, `50`, `100`, `35`

O programa aceitará `20`, `50` e `100`, mas terminará quando `35` for inserido, pois `35 % 10` não é igual a `0`.
