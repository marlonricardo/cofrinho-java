package com.marlon.projeto.cofrinho;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cofrinho {
    private List<Moedas> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }
 // implementado método para adicionar uma moeda ao cofrinho
    public void adicionarMoeda(Moedas moeda) {
        moedas.add(moeda);
    }
 // Implementado o método para remover uma moeda do cofrinho
    public void removerMoeda(int i) {
        moedas.remove(i);
    }
 // Implementado o este método para calcular o valor total em Real das moedas no cofrinho
    public double calcularValorTotalEmReal() {
        double valorTotal = 0.0;
        for (Moedas moeda : moedas) {
            valorTotal += moeda.converterParaReal();
        }
        return valorTotal;
    }
    
 // Este método privado foi implementado para mostrar as moedas presentes no cofrinho   
    private void mostrarMoedas() {
        System.out.println("Moedas no seu cofrinho:");
        for (int i = 0; i < moedas.size(); i++) {
            Moedas moeda = moedas.get(i);
            System.out.println(i + ": " + moeda.getNome() + ": " + moeda.getValor());
        }
        System.out.println();
    }
 // Este foi método implementado para exibir o menu e interagir com o usuário
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcoes = 0;
        while (opcoes != 5) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas no cofrinho");
            System.out.println("4 - Calcular valor total em Real");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma das opcções abaixo: ");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Selecione o tipo de moeda:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    System.out.print("Escolha uma opção: ");
                    int tipoMoeda = scanner.nextInt();

                    Moedas novaMoeda;
                    switch (tipoMoeda) {
                        case 1:
                            System.out.print("Digite o valor do Dólar: ");
                            double valorDolar = scanner.nextDouble();
                            novaMoeda = new Dolar(valorDolar);
                            break;
                        case 2:
                            System.out.print("Digite o valor do Euro: ");
                            double valorEuro = scanner.nextDouble();
                            novaMoeda = new Euro(valorEuro);
                            break;
                        case 3:
                            System.out.print("Digite o valor do Real: ");
                            double valorReal = scanner.nextDouble();
                            novaMoeda = new Real(valorReal);
                            break;
                        default:
                            System.out.println("Opção incorreta!\n");
                            continue;
                    }

                    adicionarMoeda(novaMoeda);
                    System.out.println("Moeda adicionada!\n");
                    break;
                case 2:
                    mostrarMoedas();
                    System.out.print("Informe o índice da moeda a ser removida: ");
                    int i = scanner.nextInt();
                    if (i >= 0 && i < moedas.size()) {
                        removerMoeda(i);
                        System.out.println("Moeda removida do cofrinho!\n");
                    } else {
                        System.out.println("Índice inválido!\n");
                    }
                    break;
                case 3:
                    mostrarMoedas();
                    break;
                case 4:
                    double valorTotal = calcularValorTotalEmReal();
                    System.out.println("Total em Real seu Cofrinho: " + valorTotal + "\n");
                    break;
                case 5:
                    System.out.println("Finaliznado o programa..");
                    break;
                default:
                    System.out.println("Opção incorreta!\n");
                    break;
            }
        }
        scanner.close();
    }
}