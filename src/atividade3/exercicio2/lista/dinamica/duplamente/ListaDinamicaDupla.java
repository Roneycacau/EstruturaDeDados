package atividade3.exercicio2.lista.dinamica.duplamente;

import atividade3.exercicio2.NoDuplo;

public class ListaDinamicaDupla<T> {
    private NoDuplo<T> inicio;
    private NoDuplo<T> fim;
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public ListaDinamicaDupla() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return tamanho == 0;
    }

    public NoDuplo<T> inserirInicio(T item) {
        NoDuplo<T> novo = new NoDuplo<>(item);
        novo.setProximo(inicio);
        if (inicio != null)
            inicio.setAnterior(novo);
        inicio = novo;
        tamanho++;
        return inicio;
    }

    public NoDuplo<T> inserirFinal(T item) {
        NoDuplo<T> novo = new NoDuplo<>(item);
        fim = novo;
        if (listaVazia()) {
            fim = novo;
            return inserirInicio(item);
        }
        NoDuplo<T> aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        fim.setAnterior(aux);
        aux.setProximo(fim);
        tamanho++;
        return fim;
    }



    public NoDuplo<T> inserirQualquer(T item, int posicao) {
        if (posicao > tamanho + 1 || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (posicao == 1) {
            return inserirInicio(item);
        }
        if (posicao == tamanho + 1) {
            return inserirFinal(item);
        }
        NoDuplo<T> novo = new NoDuplo<T>(item);
        NoDuplo<T> aux = inicio;
        for (int i = 1; i < posicao - 1; i++) {
            aux = aux.getProximo();
        }
        novo.setAnterior(aux);
        novo.setProximo(aux.getProximo());
        aux.getProximo().setAnterior(novo);
        aux.setProximo(novo);
        tamanho++;
        return novo;
    }

    public NoDuplo<T> removerInicio() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        NoDuplo<T> aux = inicio;
        if (inicio.getProximo() != null)
            inicio.getProximo().setAnterior(null);
        inicio = inicio.getProximo();
        tamanho--;
        return aux;
    }

    public NoDuplo<T> removerFinal() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        NoDuplo<T> aux = inicio;
        if (tamanho == 1) {
            return removerInicio();
        }
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        fim = aux;
        aux.getAnterior().setProximo(null);
        tamanho--;
        return fim;
    }

    public NoDuplo<T> removerQualquer(int posicao) {
        NoDuplo<T> aux, aux2 = inicio;
        if (posicao > tamanho || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        if (posicao == 1) {
            return removerInicio();
        } else if (posicao == tamanho) {
            return removerFinal();
        } else {
            aux = inicio;
            for (int i = 1; i < posicao; i++) {
                aux = aux.getProximo();
            }
            aux2 = aux;
            aux.getProximo().setAnterior(aux.getAnterior());
            aux.getAnterior().setProximo(aux.getProximo());
            tamanho--;
        }
        return aux2;
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Lista Vazia";

        String exibir = "Lista: \n";
        NoDuplo<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + "\n";
            aux = aux.getProximo();
        }
        exibir += aux.toString();

        return exibir;
    }

    public String mostraLista(NoDuplo<T> aux, String resultadoPesquisa, boolean primeiraExecucao) {
        if (primeiraExecucao) {
            aux = inicio;
            primeiraExecucao = false;
        }

        if (aux != null) {
            resultadoPesquisa = resultadoPesquisa + "\n T: " + aux.toString();
            return mostraLista(aux.getProximo(), resultadoPesquisa, primeiraExecucao);
        }
        return resultadoPesquisa;
    }
}
