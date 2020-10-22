package atividade3.exercicio2;

import atividade3.exercicio2.lista.dinamica.duplamente.ListaDinamicaDupla;
import atividade3.exercicio2.lista.dinamica.duplamente.recursiva.ListaDinamicaDuplaRecursiva;
import atividade3.exercicio2.lista.dinamica.simples.ListaDinamicaSimples;
import atividade3.exercicio2.lista.estatica.ListaEstatica;

import java.util.Random;

public class TestandoAsParadinha {
    static Random random = new Random();

    public static void main(String[] args) {
        Curso aux;
        Fila<Curso> fila = new Fila<>();
        Pilha<Curso> pilha = new Pilha<>();
        ListaEstatica<Curso> listaEstatica = new ListaEstatica<>();
        ListaDinamicaSimples<Curso> listaDinamicaSimples = new ListaDinamicaSimples<>();
        ListaDinamicaDupla<Curso> listaDinamicaDupla = new ListaDinamicaDupla<>();
        ListaDinamicaDuplaRecursiva listaDinamicaDuplaRecursiva = new ListaDinamicaDuplaRecursiva();

        System.out.println("======Fila======");
        System.out.println("fila.percorre()");
        System.out.println(fila.toString());
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);
        filaAdd(fila);


        System.out.println(fila.toString());
        fila.desenfileirar();
        System.out.println(fila.toString());

        System.out.println("======Pilha======");

        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        pilha.empilhar(curso());
        System.out.println(pilha.toString());
        pilha.desempilhar();
        System.out.println(pilha.toString());
    }

    private static void filaAdd(Fila<Curso> fila) {
        Curso aux;
        aux = curso();
        System.out.println("fila.enfileirar(" + aux.toString() + ")");
        fila.enfileirar(aux);
        System.out.println(fila.toString());
    }


    private static Curso curso() {
        String area = numeruzin() == 1 ? "Humanas" :
                numeruzin() == 2 ? "Biológicas" :
                        numeruzin() == 3 ? "Exatas" : "Exotéricas";
        String nome = numeruzin() == 1 ? "Silva" :
                numeruzin() == 2 ? "Santos" :
                        numeruzin() == 3 ? "Oliveira" :
                                numeruzin() == 4 ? "Alves" : "Orleans e Bragança";
        int periodo = random.ints(1, 4)
                .findFirst()
                .getAsInt();

        int semestre = random.ints(1, 6)
                .findFirst()
                .getAsInt();

        return new Curso(nome, area, semestre, periodo);
    }

    private static int numeruzin() {
        return random.ints(1, 5)
                .findFirst()
                .getAsInt();
    }


}
