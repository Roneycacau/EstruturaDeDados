package lista2.exercicio4;

import lista2.util.Array;

import javax.swing.*;

public class ExercicioString {
    public static void main(String[] args) {
        Array<String> palavras = new Array<>();
        int op = 0, pos;
        String palavra;
        String mensagemInput = "Insira uma palavra ou frase";
        while (op != 99) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona em uma posição específica\n"
                        + "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n99-Sair"));
            }catch (Exception e){
                System.out.print(e.getMessage());
            }

            switch (op) {
                case 1:
                    palavra = JOptionPane.showInputDialog(mensagemInput);
                    JOptionPane.showMessageDialog(null, palavras.adicionarFim(palavra));
                    break;
                case 2:
                    palavra = JOptionPane.showInputDialog(mensagemInput);
                    JOptionPane.showMessageDialog(null, palavras.adicionaInicio(palavra));
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que você deseja inserir a palavra"));
                    palavra = JOptionPane.showInputDialog(mensagemInput);
                    pos = pos - 1;
                    JOptionPane.showMessageDialog(null, palavras.adicionaEspecifica(pos, palavra));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, palavras.removeFim());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, palavras.removeInicio());
                    break;
                case 6:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover a palavra"));
                    pos = pos - 1;
                    JOptionPane.showMessageDialog(null, palavras.removeEspecifica(pos));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, palavras.percorre());
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
