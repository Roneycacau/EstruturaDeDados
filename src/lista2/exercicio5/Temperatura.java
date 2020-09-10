package lista2.exercicio5;

import lista2.util.Array;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {
        Array<Double> temperaturas = new Array<>();
        int op = 0, pos;
        double temperatura;
        String mensagemInput = "Insira uma temperatura";
        while (op != 99) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona em uma posição específica\n"
                        + "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n99-Sair"));
            }catch (Exception e){
                System.out.print(e.getMessage());
            }

            switch (op) {
                case 1:
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog(mensagemInput));
                    JOptionPane.showMessageDialog(null, temperaturas.adicionarFim(temperatura));
                    break;
                case 2:
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog(mensagemInput));
                    JOptionPane.showMessageDialog(null, temperaturas.adicionaInicio(temperatura));
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que você deseja inserir a temperatura"));
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog(mensagemInput));
                    pos = pos - 1;
                    JOptionPane.showMessageDialog(null, temperaturas.adicionaEspecifica(pos, temperatura));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, temperaturas.removeFim());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, temperaturas.removeInicio());
                    break;
                case 6:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover a temperatura"));
                    pos = pos - 1;
                    JOptionPane.showMessageDialog(null, temperaturas.removeEspecifica(pos));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, temperaturas.percorre());
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
