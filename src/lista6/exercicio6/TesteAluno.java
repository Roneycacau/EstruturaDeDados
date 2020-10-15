package lista6.exercicio6;

import javax.swing.JOptionPane;

public class TesteAluno {

    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        String nome;
        String curso;
        int opc = 0;
        String resultadoListar;

        while(opc != 99) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Esta vazia ? \n2 - Adiciona Inicio \n3 - Adiciona Final \n4 - Remove Inicio \n5 - Remove Final \n7 - Mostrar \n99 - Sair"));
            switch(opc){
                case 1: boolean vazia = lista.estaVazia();
                    if (vazia) {
                        JOptionPane.showMessageDialog(null, "Lista esta vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista nao esta vazia!");
                    }
                    break;
                case 2: nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
                    curso = JOptionPane.showInputDialog("Digite o curso do Aluno");
                    Aluno alunoInicio = new Aluno(nome, curso);
                    lista.adicionaInicio(alunoInicio);
                    break;
                case 3: nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
                    curso = JOptionPane.showInputDialog("Digite o curso do Aluno");
                    Aluno alunoFinal = new Aluno(nome, curso);
                    lista.adicionaFinal(alunoFinal);
                    break;
                case 4: lista.removeInicio();
                    break;
                case 5: lista.removeFinal();
                    break;
                case 7: resultadoListar = lista.mostraLista(null, "", true);
                    System.out.println(resultadoListar);
                    break;
                case 99: System.exit(0);
            }
        }

    }

}
