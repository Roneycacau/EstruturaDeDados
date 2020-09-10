package lista2.emaula;

import javax.swing.*;

public class TesteLista {
    public static void main(String[]args){
        Lista idades=new Lista();
        int op=0,idade,pos;
        while(op!=99){
            op=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona em uma posição específica\n"
                    + "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n99-Sair"));

            switch(op){
                case 1:
                    idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    if (idade>=0){
                        idades.AdicionaFinal(idade);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Idade inválida, digite outra");
                    }
                    break;
                case 2:
                    idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    if (idade>=0){
                        idades.AdicionaInicio(idade);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Idade inválida, digite outra");
                    }
                    break;
                case 3:
                    idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que você deseja inserir a idade"));
                    pos=pos-1;

                    if (idade>=0){
                        idades.AdicionaQualquerPosicao(idade, pos);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"O elemento removido foi:"+idades.RemoveFinal());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"O elemento removido foi:"+idades.RemoveInicio());
                    break;
                case 6:
                    pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover a idade"));
                    pos=pos-1;
                    JOptionPane.showMessageDialog(null,"O elemento removido foi:"+idades.RemoveQualquerPosicao(pos));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Lista:"+idades.percorre());
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null,"Saindo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
            }
        }
    }
}