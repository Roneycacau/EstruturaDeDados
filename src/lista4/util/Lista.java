package lista4.util;

public class Lista<T> {
    private No<T> inicio;
    private int tamanho;

    public Lista() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean listaVazia() {
        return tamanho == 0;
    }

    public void inserirInicio(T item) {
        No<T> novo = new No<>(item);
        novo.setProximo(inicio);
        inicio = novo;
        tamanho++;
    }

    public void inserirFinal(T item) {
        No<T> novo = new No<>(item);
        No<T> aux = inicio;
        if (listaVazia()) {
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public void inserirQualquer(T item, int posicao) {
        if (posicao == 1) {
            inserirInicio(item);
        } else if (posicao == tamanho + 1) {
            inserirFinal(item);
        } else if (posicao > tamanho + 1 || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        } else {
            No<T> novo = new No<>(item);
            No<T> ponteiro = inicio;
            for (int i = 1; i < posicao; i++) {
                ponteiro = ponteiro.getProximo();
            }
            novo.setProximo(ponteiro.getProximo());
            ponteiro.setProximo(novo);
        }
        tamanho++;
    }

    public void removerInicio() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        inicio = inicio.getProximo();
        tamanho--;
    }

    public void removerFinal() {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        }
        No<T> aux = inicio;
        for (int i = 1; i < tamanho - 1; i++) {
            aux.getProximo();
        }
        aux.setProximo(null);
        tamanho--;
    }

    public void removerQualquer(int posicao) {
        if (listaVazia()) {
            throw new IllegalArgumentException("Lista Vazia");
        } else if (posicao == 1) {
            removerInicio();
        } else if (posicao == tamanho) {
            removerFinal();
        } else if (posicao > tamanho || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        } else {
            No<T> aux = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                aux = aux.getProximo();
            }
            aux.setProximo(aux.getProximo().getProximo());
        }
    }

    @Override
    public String toString() {
        if(listaVazia()) return "Lista Vazia";

        StringBuilder exibir = new StringBuilder("Lista: \n");
        No<T> aux = inicio;
        while (aux.getProximo() != null){
            exibir.append(aux.toString());
            exibir.append("\n");
        }
        exibir.append(aux.toString());
        return exibir.toString();
    }
}
