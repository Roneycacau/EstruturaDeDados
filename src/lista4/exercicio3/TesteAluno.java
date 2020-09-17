package lista4.exercicio3;

import lista4.util.Lista;

import java.util.Random;

public class TesteAluno {
        static Random random = new Random();
    public static void main(String[] args) {
        String turma = "Turma " + numeruzin();
        String semestre = numeruzin() + "º";
        String nome = "Aluno " + sobrenome() + " " + sobrenome();


        Aluno aluno = new Aluno(nome, turma, semestre);
        Lista<Aluno> alunos = new Lista<>();
        System.out.println("Lista vazia?" + alunos.listaVazia());

        alunos.inserirInicio(new Aluno(nome, turma, semestre));
        alunos.inserirInicio(new Aluno(nome, turma, semestre));
        alunos.inserirInicio(new Aluno(nome, turma, semestre));
        alunos.inserirInicio(new Aluno(nome, turma, semestre));
        alunos.inserirInicio(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirFinal(new Aluno(nome, turma, semestre));
        alunos.inserirQualquer(new Aluno(nome, turma, semestre), 2);
        alunos.inserirQualquer(new Aluno(nome, turma, semestre), 2);
        alunos.inserirQualquer(new Aluno(nome, turma, semestre), 2);
        alunos.inserirQualquer(new Aluno(nome, turma, semestre), 2);
        alunos.inserirQualquer(new Aluno(nome, turma, semestre), 2);
        alunos.removerInicio();
        alunos.removerInicio();
        alunos.removerInicio();
        alunos.removerInicio();
        alunos.removerInicio();
        alunos.removerFinal();
        alunos.removerFinal();
        alunos.removerFinal();
        alunos.removerFinal();
        alunos.removerFinal();
        alunos.removerQualquer(random.nextInt(6) + 1);
        alunos.removerQualquer(random.nextInt(6) + 1);
        alunos.removerQualquer(random.nextInt(6) + 1);
        alunos.removerQualquer(random.nextInt(6) + 1);
        alunos.removerQualquer(random.nextInt(6) + 1);

        alunos.toString();
    }

    public static int numeruzin(){
        return random.ints(1, 5)
                .findFirst()
                .getAsInt();
    }
    public static String sobrenome(){
        return numeruzin() == 1 ? "Silva" :
                numeruzin() == 2 ? "Santos" :
                        numeruzin() == 3 ? "Oliveira" :
                                numeruzin() == 4 ? "Alves" : "Orleans e Bragança";
    }
}
