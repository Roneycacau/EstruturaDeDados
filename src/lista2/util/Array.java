package lista2.util;

public class Array<T> {
    int tamanho = 0;
    T[] vetor;
    String mensagemListaCheia = "Lista Cheia";
    String mensagemListaVazia = "Lista Vazia";

    public Array() {
        vetor = (T[]) new Object[5];
    }

    public boolean listaVazia() {
        for (T item : vetor) {
            if (item != null) {
                return false;
            }
        }
        return true;
    }

    public boolean listaCheia() {
        return tamanho != vetor.length;
    }

    public String adicionaInicio(T e) {
        if (listaCheia()) {
            if (!listaVazia()) {
                for (int i = tamanho; i >= 1; i--) {
                    vetor[i] = vetor[i - 1];
                }
            }
            vetor[0] = e;
            tamanho++;
        } else {
            return mensagemListaCheia;
        }
        return e + " adicionado na posição inicial.";
    }

    public String adicionarFim(T e) {
        if (listaCheia()) {
            vetor[tamanho] = e;
            tamanho++;
        } else {
            return mensagemListaCheia;
        }
        return e + " adicionado no final da lista.";
    }

    public String adicionaEspecifica(int pos, T e) {
        String mensagem;
        if (pos > tamanho && pos < 0) {
            mensagem = "Posição não existe na lista";
        } else {
            mensagem = e + " adicionado na posição " + pos + 1;
            for (int i = tamanho - 1; i >= pos; i--) {
                vetor[i + 1] = this.vetor[i];
            }
            this.vetor[pos] = e;
            tamanho++;
        }
        return mensagem;
    }

    public String removeInicio() {
        String mensagem = vetor[0] + " removido da lista";
        if (listaVazia()) return mensagemListaVazia;
        for (int i = 1; i < tamanho; i++) {
            vetor[i - 1] = vetor[i];
        }
        tamanho--;
        return mensagem;
    }

    public String removeFim() {
        String mensagem = vetor[tamanho - 1] + " removido da lista";
        if (listaVazia()) return mensagemListaVazia;
        tamanho--;
        return mensagem;
    }

    public String removeEspecifica(int pos) {
        String mensagem = vetor[pos] + " removido da lista";
        if (listaVazia()) return mensagemListaVazia;
        for (int i = pos; i < tamanho-1; i++) {
            vetor[i] = vetor[i + 1];
        }
        tamanho--;
        return mensagem;
    }

    public String percorre() {
        StringBuilder mensagem = new StringBuilder("Lista:");
        if (listaVazia()) return "Lista Vazia.";
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] != null)
                mensagem.append("\n").append(vetor[i]);
        }
        return mensagem.toString();
    }
}
