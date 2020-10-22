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

    public void desenfileirar() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        inicio = inicio.getProximo();
        tamanho--;
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Fila Vazia\n";

        String exibir = "Fila: \n";
        NoSimples<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + " ";
            aux = aux.getProximo();
        }
        exibir += aux.toString();

        return exibir+"\n";
    }
}
