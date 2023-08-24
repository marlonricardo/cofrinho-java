package com.marlon.projeto.cofrinho;

//definição de uma classe abstrata Moedas, que representa uma moeda genérica.
abstract class Moedas {
//declaração de dois atributos privados: nome, que armazena o nome da moeda, e valor, que armazena o valor da moeda.	
    private String nome;
    private double valor;
//construtor da classe Moedas, que recebe o nome e o valor da moeda como parâmetros.
    public Moedas(String nome, double valor) {
        this.nome = nome;//atribuição o valor do parâmetro nome ao atributo nome da classe.
        this.valor = valor;//Atribui o valor do parâmetro valor ao atributo valor da classe.
    }
//retorna o nome da moeda.
    public String getNome() {
        return nome;
    }
//retorna o valor da moeda.
    public double getValor() {
        return valor;
    }
    //método abstrato converterParaReal(), que será implementado nas classes filhas 
    //e irá converter o valor da moeda para Real.
    public abstract double converterParaReal();
}