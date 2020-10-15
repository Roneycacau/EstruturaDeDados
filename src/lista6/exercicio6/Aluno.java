package lista6.exercicio6;

import java.util.UUID;

public class Aluno {
    private String id;
    private String nome;
    private String curso;

    public Aluno(String nome, String curso) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.curso = curso;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}

