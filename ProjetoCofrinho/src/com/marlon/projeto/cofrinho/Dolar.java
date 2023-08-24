package com.marlon.projeto.cofrinho;

//classe Dolar que estende a classe abstrata Moedas, 
//que indica que a classe Dolar herda os atributos e métodos da classe Moedas.
class Dolar extends Moedas {
    public Dolar(double valor) {
        super("Dólar", valor);
    }

    @Override //sobescreve o método da classe pai
    public double converterParaReal() {
// levando em consideração uma taxa de conversão fixa de 4.95
        return getValor() * 4.95;
    }
}