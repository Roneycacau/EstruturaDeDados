package atividade3.exercicio2.lista.dinamica.duplamente.recursiva;

import atividade3.exercicio2.NoDuplo;

public class ListaDinamicaDuplaRecursiva<T> {

    private NoDuplo<T> inicio;
    private int tamanho;
    private NoDuplo<T> fim;

    public int getTamanho() {
        return tamanho;
    }

    public ListaDinamicaDuplaRecursiva() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return tamanho == 0;
    }

    public NoDuplo<T> buscarUltimo(NoDuplo<T> aux) {
        if (aux.getProximo() != null) {
            return buscarUltimo(aux.getProximo());
        }
        return aux;
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
        NoDuplo<T> aux = buscarUltimo(inicio);
        fim.setAnterior(aux);
        aux.setProximo(fim);
        tamanho++;
        return fim;
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
        if (tamanho == 1) {
            return removerInicio();
        }

        NoDuplo<T> aux = buscarUltimo(inicio);
        fim = aux;
        aux.getAnterior().setProximo(null);
        tamanho--;
        return fim;
    }

    public String mostrarLista(NoDuplo<T> aux, String resultadoPesquisa, boolean primeiraExecucao) {
        if (primeiraExecucao) {
            aux = inicio;
            primeiraExecucao = false;
        }

        if (aux != null) {
            resultadoPesquisa = resultadoPesquisa + "\n" + aux.toString();
            return mostrarLista(aux.getProximo(), resultadoPesquisa, false);
        }
        return resultadoPesquisa;
    }

}
