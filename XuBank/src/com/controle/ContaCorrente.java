package com.controle;

public class ContaCorrente extends Conta {
    private double limiteSaqueEspecial;
    private static final double TAXA_MENSAL = 20.0;

    // Construtor
    public ContaCorrente(int numero, double saldo, Cliente titular, double limiteSaqueEspecial) {
        super(numero, saldo, titular);
        this.limiteSaqueEspecial = limiteSaqueEspecial;
    }

    // Métodos específicos da ContaCorrente
    public double getLimiteSaqueEspecial() {
        return limiteSaqueEspecial;
    }

    public void setLimiteSaqueEspecial(double limiteSaqueEspecial) {
        this.limiteSaqueEspecial = limiteSaqueEspecial;
    }

    // Implementação do método abstrato depositar
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    // Implementação do método abstrato sacar
    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limiteSaqueEspecial;
        
        if (valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Implementação do método abstrato calcularSaldo
    @Override
    public void calcularSaldo() {
        // Deduz a taxa mensal da conta corrente
        setSaldo(getSaldo() - TAXA_MENSAL);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
               "numero=" + getNumero() +
               ", saldo=" + getSaldo() +
               ", titular=" + getTitular().getNome() +
               ", limiteSaqueEspecial=" + limiteSaqueEspecial +
               '}';
    }
}
