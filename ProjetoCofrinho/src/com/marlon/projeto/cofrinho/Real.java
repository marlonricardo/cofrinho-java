package com.marlon.projeto.cofrinho;
//classe Real que estende a classe abstrata Moedas, 
//que indica que a classe Real herda os atributos e métodos da classe Moedas.
class Real extends Moedas {
    public Real(double valor) {
        super("Real", valor);
    }

    @Override
    public double converterParaReal() {
        return getValor();
    }
}