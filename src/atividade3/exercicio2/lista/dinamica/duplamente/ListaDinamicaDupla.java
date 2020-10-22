package atividade3.exercicio2.lista.dinamica.duplamente;

import atividade3.exercicio2.NoDuplo;

public class ListaDinamicaDupla<T> {
    private NoDuplo<T> inicio;
    private int tamanho;
    private T[] array;

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
        novo.setAnterior(null);
        inicio.setAnterior(novo);
        inicio = novo;
        tamanho++;
        return novo;
    }

    public NoDuplo<T> inserirFinal(T item) {
        NoDuplo<T> novo = new NoDuplo<>(item);

        if (listaVazia()) {
            inicio = novo;
            tamanho++;
            return novo;
        }
        NoDuplo<T> aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        novo.setAnterior(aux);
        aux.setProximo(novo);
        return novo;
    }

    public NoDuplo<T> BuscaUltimo(NoDuplo<T> aux) {
        if (aux.getProximo() != null) {
            return BuscaUltimo(aux.getProximo());
        }
        return aux;
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
        aux.setAnterior(novo);
        novo.setProximo(aux.getProximo());
        aux.setProximo(novo);
        tamanho++;
        return novo;
    }

    public void removeInicio() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        inicio = inicio.getProximo();
        inicio.setAnterior(null);
        tamanho--;
    }

    public void removeFinal() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        NoDuplo<T> aux = inicio;
        for (int i = 1; i < tamanho - 1; i++) {
            aux = aux.getProximo();
        }
        aux.setProximo(null);
        tamanho--;
    }

    public void removerQualquer(int posicao) {
        if (posicao > tamanho || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        if (posicao == 1) {
            removeInicio();
        } else if (posicao == tamanho) {
            removeFinal();
        }  else {
            NoDuplo<T> aux = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                aux = aux.getProximo();
            }
            aux.getProximo().setAnterior(aux.getAnterior());
            aux.setProximo(aux.getProximo().getProximo());
            tamanho--;
        }
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Lista Vazia";

        String exibir ="Lista: \n";
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
