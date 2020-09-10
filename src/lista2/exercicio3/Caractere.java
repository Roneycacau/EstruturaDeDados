package lista2.exercicio3;

import lista2.util.Array;

import javax.swing.*;

public class Caractere {
    public static void main(String[] args) {
        Array<Character> letrinhas = new Array<>();
        int op = 0, pos;
        char letrinha;
        String mensagemInput = "Insira uma letra aí, se colocar mais só vou pegar a primeira";
        while (op != 99) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona em uma posição específica\n"
                        + "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n99-Sair"));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }

            switch (op) {
                case 1:
                    letrinha = JOptionPane.showInputDialog(mensagemInput).charAt(0);
                    JOptionPane.showMessageDialog(null, letrinhas.adicionarFim(letrinha));
                    break;
                case 2:
                    letrinha = JOptionPane.showInputDialog(mensagemInput).charAt(0);
                    JOptionPane.showMessageDialog(null, letrinhas.adicionaInicio(letrinha));
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que você deseja inserir a letrinha"));
                    letrinha = JOptionPane.showInputDialog(mensagemInput).charAt(0);
                    pos = pos - 1;
                    JOptionPane.showMessageDialog(null, letrinhas.adicionaEspecifica(pos, letrinha));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, letrinhas.removeFim());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, letrinhas.removeInicio());
                    break;
                case 6:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover a letrinha"));
                    pos = pos - 1;
                    JOptionPane.showMessageDialog(null, letrinhas.removeEspecifica(pos));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, letrinhas.percorre());
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null, "Saindo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }
    }
}