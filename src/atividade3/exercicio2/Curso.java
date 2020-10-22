package atividade3.exercicio2;

public class Curso {
    private static int count = 1;

    private int id;
    private String nome;
    private String area;
    private int semestres;
    private int periodo;

    public Curso() {
    }

    public Curso(String nome, String area, int semestres, int periodo) {
        this.id = count++;
        this.nome = "Aluno " + nome;
        this.area = area;
        this.semestres = semestres;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "{ Curso "+ id +" }";
    }
}
