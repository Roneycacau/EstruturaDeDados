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

    public No<T> inserirInicio(T item) {
        No<T> novo = new No<T>(item);
        novo.setProximo(inicio);
        inicio = novo;
        tamanho++;
        return novo;
    }

    public No<T> inserirFinal(T item) {
        No<T> novo = new No<T>(item);
        if (listaVazia()) {
            inicio = novo;
            tamanho++;
            return novo;
        }
        No<T> aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        aux.setProximo(novo);
        tamanho++;
        return novo;
    }


    public No<T> inserirQualquer(T item, int posicao) {
        if (posicao > tamanho + 1 || posicao < 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (posicao == 1) {
            return inserirInicio(item);
        }
        if (posicao == tamanho + 1) {
            return inserirFinal(item);
        }
        No<T> novo = new No<T>(item);
        No<T> aux = inicio;
        for (int i = 1; i < posicao -1 ; i++) {
            aux = aux.getProximo();
        }
        novo.setProximo(aux.getProximo());
        aux.setProximo(novo);
        tamanho++;
        return novo;
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
            removerInicio();
        } else if (posicao == tamanho) {
            removerFinal();
        }  else {
            No<T> aux = inicio;
            for (int i = 1; i < posicao - 1; i++) {
                aux = aux.getProximo();
            }
            aux.setProximo(aux.getProximo().getProximo());
            tamanho--;
        }
    }

    @Override
    public String toString() {
        if (listaVazia()) return "Lista Vazia";

        String exibir ="Lista: \n";
        No<T> aux = inicio;
        while (aux.getProximo() != null) {
            exibir += aux.toString() + "\n";
        }
        exibir += aux.toString();

        return exibir;
    }
}
