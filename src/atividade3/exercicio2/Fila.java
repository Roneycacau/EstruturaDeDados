package atividade3.exercicio2;

public class Fila<T> {
    private NoSimples<T> inicio;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return tamanho == 0;
    }

    public NoSimples<T> enfileirar(T item) {
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

    public NoSimples<T> desenfileirar() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        NoSimples<T> aux = inicio;
        inicio = inicio.getProximo();
        tamanho--;
        return aux;
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Fila Vazia";

        String exibir = "Fila: \n";
        NoSimples<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + " ";
            aux = aux.getProximo();
        }
        exibir += aux.toString();

        return exibir;
    }
}
