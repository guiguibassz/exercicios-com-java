# Projeto 2: Calculadora de IMC (Índice de Massa Corporal)

Esta é uma ferramenta de saúde que calcula o IMC de uma pessoa com base em sua altura e peso e fornece uma classificação de acordo com as diretrizes da OMS.

## Objetivo

O principal objetivo é aplicar a lógica condicional (`if`, `else if`, `else`) para categorizar um valor calculado e fornecer feedback útil ao usuário. O projeto também envolve o cálculo de fórmulas matemáticas básicas.

## Como Funciona

1.  O programa pede ao usuário para inserir seu peso (em quilogramas) e sua altura (em metros).
2.  Ele calcula o IMC usando a fórmula: `IMC = peso / (altura * altura)`.
3.  Com base no resultado do IMC, o programa utiliza uma série de estruturas condicionais para determinar a classificação de peso correspondente.
4.  A classificação é então exibida para o usuário.

### Tabela de Classificação do IMC

| IMC                  | Classificação              |
| -------------------- | -------------------------- |
| Menor ou igual a 18,5| Abaixo do peso             |
| Entre 18,6 e 24,9    | Peso ideal                 |
| Entre 25,0 e 29,9    | Levemente acima do peso    |
| Entre 30,0 e 34,9    | Obesidade Grau I           |
| Entre 35,0 e 39,9    | Obesidade Grau II (Severa) |
| Maior ou igual a 40,0| Obesidade III (Mórbida)    |



