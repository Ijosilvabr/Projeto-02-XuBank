# Projeto-02-XuBank
Controle de Contas Bancárias
# XuBank - Sistema de Gerenciamento de Contas

O XuBank é uma fintech emergente que precisa de um sistema modular e confiável para administrar as contas de seus clientes. Este projeto é um sistema de informação que atende aos requisitos do produto, fazendo uso de conceitos avançados de programação orientada a objetos, como herança, polimorfismo, interfaces e diagrama de classes.

## Requisitos

### Clientes

- Atributos: nome, CPF e senha.
- Tipos de cliente: regular, gold e vip.
- Todos os clientes podem possuir múltiplos tipos de contas.
- Clientes devem ser capazes de acessar extratos, saldos e realizar operações em suas contas.

### Tipos de Conta

- Conta Corrente: Taxa mensal de R$20. Saque especial até R$200 além do saldo.
- Poupança: Sem taxa mensal. Rendimento fixo de 0,5% no dia 5 de cada mês.
- Renda Fixa: Sem taxa mensal. Rendimento contratado no momento da criação. Imposto de 15% sobre o rendimento no momento do saque.
- Investimento: Rendimento diário (positivo ou negativo). Imposto de 15% e taxa de 1,5% sobre o rendimento no saque.

### Fidelidade de Clientes

- Clientes Regulares: Acesso padrão às contas conforme regras descritas.
- Clientes Gold: Taxa mensal de R$10. Acumulam 10 pontos de fidelidade mensalmente e 10 pontos para cada R$1.000 de saldo.
- Clientes Vip: Mensalidade de R$30. Acumulam 35 pontos mensalmente e 30 pontos a cada R$2.000 de saldo.

### Sistema de Recompensas

- Os clientes podem trocar seus pontos acumulados por prêmios, descontos em serviços ou até mesmo convertê-los em dinheiro.

## Instruções de Uso

1. Clone o repositório para sua máquina local.
2. Compile e execute o código Java.
3. Siga as instruções apresentadas no terminal para realizar operações nas contas.

## Diagrama de Classes

O projeto inclui um diagrama de classes para melhor compreensão da estrutura do sistema. Você pode encontrar o diagrama no arquivo `diagrama-de-classes.png`.

## Boas Práticas de Programação

- Utilize herança para criar classes base para Cliente e Conta, e depois subclasses para os tipos específicos.
- Implemente interfaces para garantir que todas as contas tenham os métodos necessários.
- Faça uso de polimorfismo onde aplicável.
- Garanta a encapsulação dos dados.

