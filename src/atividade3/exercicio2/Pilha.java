package atividade3.exercicio2;

public class Pilha<T> {
    private NoSimples<T> inicio;
    private int tamanho;

    public Pilha() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return tamanho == 0;
    }

    public NoSimples<T> empilhar(T item) {
        NoSimples<T> novo = new NoSimples<T>(item);
        if (listaVazia()) {
            inicio = novo;
            tamanho++;
            return novo;
        }
        NoSimples<T> aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        aux.setProximo(novo);
        tamanho++;
        return novo;
    }

    public void desempilhar() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Pilha Vazia");
        }
        NoSimples<T> aux = inicio;
        for (int i = 1; i < tamanho - 1; i++) {
            aux = aux.getProximo();
        }
        aux.setProximo(null);
        tamanho--;
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Pilha Vazia";

        String exibir ="Por motivos de facilitar a implementação essa pilha está de ponta cabeça :) \nvvv Base vvv\n";
        NoSimples<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + "\n";
            aux = aux.getProximo();
        }
        exibir += aux.toString();

        return exibir + "\n^^^ Topo ^^^";
    }
}
