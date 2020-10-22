package atividade3.exercicio2.lista.dinamica.duplamente.recursiva;

import atividade3.exercicio2.NoDuplo;

public class ListaDinamicaDuplaRecursiva<T> {

    private NoDuplo<T> inicio;
    private int tamanho;
    private T[] array;

    public ListaDinamicaDuplaRecursiva() {
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
        NoDuplo<T> aux = BuscaUltimo(inicio);
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
        NoDuplo<T> aux = BuscaUltimo(inicio);
        aux.setProximo(null);
        tamanho--;
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
