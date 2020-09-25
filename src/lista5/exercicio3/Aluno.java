package lista5.exercicio3;

public class Aluno {
    private static int count = 0;
    private  int ra;
    private String nome;
    private String turma;
    private String semestre;

    public Aluno() {
    }

    public Aluno(String nome, String turma, String semestre) {
        this.ra = count++;
        this.nome = nome;
        this.turma = turma;
        this.semestre = semestre;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }
}
