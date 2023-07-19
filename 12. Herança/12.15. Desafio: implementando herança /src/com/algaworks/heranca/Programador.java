package com.algaworks.heranca;

// Recebendo o mesmo argumento, para CalcularSalario, multiplica horaTrabalho por valorHora
// e incluir e depois somar com o valorBonus
// na Sobreescrita podemos usar super.calcularSalario para aproveita a conta
public class Programador extends Funcionario {

    private double valorBonus;
    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return valorBonus != 0 ?
                super.calcularSalario(horasTrabalhadas) + valorBonus : super.calcularSalario(horasTrabalhadas);
    }

    @Override
    public String toString() {
        return "Programador [" +
                "nome = " + getNome() +'\'' +
                ", valorHora = " + getValorHora() +
                "valorBonus = " + valorBonus +
                ']';
    }
}

