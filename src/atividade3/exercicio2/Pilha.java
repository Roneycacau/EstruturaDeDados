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

    public NoSimples<T> desempilhar() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Pilha Vazia");
        }
        NoSimples<T> aux = inicio;
        if (tamanho == 1) {
            tamanho--;
            inicio = null;
            return inicio;
        }
        for (int i = 1; i < tamanho - 2; i++) {
            aux = aux.getProximo();
        }
        NoSimples<T> aux2 = aux.getProximo();
        aux.setProximo(null);
        tamanho--;
        return aux2;
    }

    @Override
    public String toString() {
        if (listaVazia()) return "\nvvv Base vvv\nPilha Vazia\n^^^ Topo ^^^";

        String exibir = "\nvvv Base vvv";
        NoSimples<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + "\n";
            aux = aux.getProximo();
        }
        exibir += aux.toString();

        return exibir + "\n^^^ Topo ^^^";
    }
}
