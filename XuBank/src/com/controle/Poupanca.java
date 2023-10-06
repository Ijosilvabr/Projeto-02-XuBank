package com.controle;

import java.util.Calendar;
import java.util.Date;

public class Poupanca extends Conta {
    // Construtor
    public Poupanca(int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    // Implementação do método abstrato 
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    // Implementação do método abstrato
    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Implementação do método abstrato 
    @Override
    public void calcularSaldo() {
        // Verifique se hoje é dia 5 do mês
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int diaDoMes = calendar.get(Calendar.DAY_OF_MONTH);

        if (diaDoMes == 5) {
            // Calcula o rendimento mensal com taxa de rendimento (0,5%)
            double rendimentoMensal = (getSaldo() * 0.005); // 0,5% = 0,005
            setSaldo(getSaldo() + rendimentoMensal);
        }
    }

    @Override
    public String toString() {
        return "Poupanca{" +
               "numero=" + getNumero() +
               ", saldo=" + getSaldo() +
               ", titular=" + getTitular().getNome() +
               '}';
    }
}
