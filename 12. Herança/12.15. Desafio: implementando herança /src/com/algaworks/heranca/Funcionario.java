package com.algaworks.heranca;

// Multiplicar o valor das horasTrabalhadas pelo valorHora
// Classe Funcionario usa o tipo Holerite
public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        this.setNome(nome);
        this.setValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora < 0) {
            throw new RuntimeException("Valor da hora informada não pode ser menor que 0");
        }
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return  horasTrabalhadas * valorHora;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        double valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                ", nome = " + nome + '\'' +
                ", valorHora = " + valorHora +
                ']';
    }
}
