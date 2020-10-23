package atividade3.exercicio2.lista.dinamica.simples;

import atividade3.exercicio2.NoSimples;

public class ListaDinamicaSimples<T> {
    private NoSimples<T> inicio;
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }


    public ListaDinamicaSimples() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return tamanho == 0;
    }

    public NoSimples<T> inserirInicio(T item) {
        NoSimples<T> novo = new NoSimples<T>(item);
        novo.setProximo(inicio);
        inicio = novo;
        tamanho++;
        return novo;
    }

    public NoSimples<T> inserirFinal(T item) {
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


    public NoSimples<T> inserirQualquer(T item, int posicao) {
        if (posicao > tamanho + 1 || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (posicao == 1) {
            return inserirInicio(item);
        }
        if (posicao == tamanho + 1) {
            return inserirFinal(item);
        }
        NoSimples<T> novo = new NoSimples<T>(item);
        NoSimples<T> aux = inicio;
        for (int i = 1; i < posicao -1 ; i++) {
            aux = aux.getProximo();
        }
        novo.setProximo(aux.getProximo());
        aux.setProximo(novo);
        tamanho++;
        return novo;
    }

    public NoSimples<T> removerInicio() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        NoSimples<T> aux = inicio;
        inicio = inicio.getProximo();
        tamanho--;
        return aux;
    }

    public NoSimples<T> removerFinal() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        NoSimples<T> aux = inicio;
        for (int i = 1; i < tamanho - 1; i++) {
            aux = aux.getProximo();
        }
        NoSimples<T> aux2 = aux.getProximo();
        aux.setProximo(null);
        tamanho--;
        return aux2;
    }

    public NoSimples<T> removerQualquer(int posicao) {
        NoSimples<T> aux, aux2 = inicio;
        if (posicao > tamanho || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        if (posicao == 1) {
            removerInicio();
        } else if (posicao == tamanho) {
            removerFinal();
        }  else {
            aux = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                aux = aux.getProximo();
            }
            aux2 = aux.getProximo();
            aux.setProximo(aux.getProximo().getProximo());
            tamanho--;
        }
        return aux2;
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Lista Vazia";

        String exibir ="Lista: \n";
        NoSimples<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + "\n";
            aux = aux.getProximo();
        }
        exibir += aux.toString();

        return exibir;
    }
}
