package com.marlon.projeto.cofrinho;
//classe Euro que estende a classe abstrata Moedas, 
//que indica que a classe Euro herda os atributos e métodos da classe Moedas.
class Euro extends Moedas {
    public Euro(double valor) {
        super("Euro", valor);
    }

    @Override
    public double converterParaReal() {
// levando em consideração uma taxa de conversão fixa de 5.26 
        return getValor() * 5.26;
    }
}