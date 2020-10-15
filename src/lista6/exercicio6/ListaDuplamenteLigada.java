package lista6.exercicio6;

import javax.swing.JOptionPane;

public class ListaDuplamenteLigada {
    private No inicio;
    private int tamanho;
    private Aluno[] dadosAluno;

    public ListaDuplamenteLigada() {
        inicio = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void adicionaInicio(Aluno aluno) {
        No novoAluno = new No(aluno);

        if (this.inicio == null) {
            this.inicio = novoAluno;
        } else {
            novoAluno.proximo = this.inicio;
            this.inicio = novoAluno;
        }
        this.tamanho++;
    }

    public void adicionaFinal(Aluno aluno) {
        No novoAluno = new No(aluno);

        if (inicio == null) {
            this.inicio = novoAluno;
        } else {
            No aux = BuscaUltimo(inicio);
            novoAluno.anterior = aux;
            aux.proximo = novoAluno;
        }
    }

    public No BuscaUltimo(No aux) {
        if (aux.proximo != null) {
            return BuscaUltimo(aux.proximo);
        }
        return aux;
    }

    public void removeInicio() {
        if (this.estaVazia()) {
            System.out.println("Lista vazia, portanto nao pode ser removido");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno: " + inicio.aluno.getNome() + " removido");
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removeFinal() {
        if (this.estaVazia()) {
            System.out.println("Lista vazia, portanto nao pode ser removido");
        } else {
            No aux = BuscaUltimo(inicio);
            JOptionPane.showMessageDialog(null, "Aluno: " + aux.aluno.getNome() + " removido");
            No aux2 = aux.anterior;
            aux2.proximo = null;
        }
    }

    public String mostraLista(No aux, String resultadoPesquisa, boolean primeiraExecucao) {
        if (primeiraExecucao) {
            aux = inicio;
            primeiraExecucao = false;
        }

        if (aux != null) {
            resultadoPesquisa = resultadoPesquisa + "\n Aluno: " + aux.aluno.getNome();
            return mostraLista(aux.proximo, resultadoPesquisa, primeiraExecucao);
        }
        return resultadoPesquisa;
    }
}
