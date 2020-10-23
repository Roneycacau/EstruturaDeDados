package atividade3.exercicio2;

import atividade3.exercicio2.lista.dinamica.duplamente.ListaDinamicaDupla;
import atividade3.exercicio2.lista.dinamica.duplamente.recursiva.ListaDinamicaDuplaRecursiva;
import atividade3.exercicio2.lista.dinamica.simples.ListaDinamicaSimples;
import atividade3.exercicio2.lista.estatica.ListaEstatica;

import java.util.Random;

public class TestandoAsParadinha {
    static Random random = new Random();

    public static void main(String[] args) {
//region config
        Fila<Curso> fila = new Fila<>();
        Pilha<Curso> pilha = new Pilha<>();
        ListaEstatica<Curso> listaEstatica = new ListaEstatica<>(30);
        ListaDinamicaSimples<Curso> listaDinamicaSimples = new ListaDinamicaSimples<>();
        ListaDinamicaDupla<Curso> listaDinamicaDupla = new ListaDinamicaDupla<>();
        ListaDinamicaDuplaRecursiva listaDinamicaDuplaRecursiva = new ListaDinamicaDuplaRecursiva();
//endregion
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("================== Fila ==================");
//region FilaAdd
        System.out.println("__________________");
        System.out.println("fila.percorre()");
        System.out.println(fila.toString());
        System.out.println("__________________");
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
//endregion

        System.out.println();

//region FilaRemove
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
        filaRemove(fila);
//endregion

        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("================== Pilha ==================" +
                "\nPor motivos de facilitar a implementação a pilha será representada de ponta cabeça \uD83D\uDE43");
//region FilhaAdd
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
        pilhaAdd(pilha);
//endregion
        System.out.println();
//region PilhaRemove
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        pilhaRemove(pilha);
        System.out.println();
        System.out.println();
        System.out.println();
//endregion

        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("============= Lista Estática =============");

//region ListaEstaticaAddInicio
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
        listaEstaticaAddInicio(listaEstatica);
//endregion

        System.out.println();

//region ListaEstaticaAddFim
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
        listaEstaticaAddFim(listaEstatica);
//endregion        

        System.out.println();

//region ListaEstaticaAddEspecifica
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
        listaEstaticaAddQualquer(listaEstatica, numeruzin(1, 30));
//endregion

        System.out.println();

//region ListaEstaticaRemoveEspecifica
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,30));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,29));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,28));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,27));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,26));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,25));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,24));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,23));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,22));
        listaEstaticaRemoveQualquer(listaEstatica, numeruzin(1,21));
//endregion

        System.out.println();

//region ListaEstaticaRemoveInicio
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
        listaEstaticaRemoveInicio(listaEstatica);
//endregion

        System.out.println();

//region ListaEstaticaRemoveFim
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
        listaEstaticaRemoveFim(listaEstatica);
//endregion

        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("============= Lista Simples ==============");


//region LlistaDinamicaSimplesAddInicio
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
        listaDinamicaSimplesAddInicio(listaDinamicaSimples);
//endregion

        System.out.println();

//region LlistaDinamicaSimplesAddFim
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
        listaDinamicaSimplesAddFim(listaDinamicaSimples);
//endregion        

        System.out.println();

//region LlistaDinamicaSimplesAddEspecifica
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
        listaDinamicaSimplesAddQualquer(listaDinamicaSimples, numeruzin(1, listaDinamicaSimples.getTamanho()+1));
//endregion

        System.out.println();

//region LlistaDinamicaSimplesRemoveEspecifica
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
        listaDinamicaSimplesRemoveQualquer(listaDinamicaSimples, numeruzin(1,listaDinamicaSimples.getTamanho()));
//endregion

        System.out.println();

//region LlistaDinamicaSimplesRemoveInicio
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
        listaDinamicaSimplesRemoveInicio(listaDinamicaSimples);
//endregion

        System.out.println();

//region LlistaDinamicaSimplesRemoveFim
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
        listaDinamicaSimplesRemoveFim(listaDinamicaSimples);
//endregion
        System.out.println();
//region ListaSimplesRemove

//endregion

        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("===========Lista Dinâmica Dupla===========");

//region ListaDinamicaDuplaAdd

//endregion
        System.out.println();
//region ListaDinamicaDuplaRemove

//endregion

        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("======Lista Dinâmica Dupla Recursiva======");

//region ListaDinamicaDuplaRecursivaAdd

//endregion
        System.out.println();
//region ListaDinamicaDuplaRecursivaRemove

//endregion


    }

    private static void filaAdd(Fila<Curso> fila) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("fila.enfileirar(" + aux.toString() + ")");
        fila.enfileirar(aux);
        System.out.println(fila.toString());
        System.out.println("__________________");
    }

    private static void filaRemove(Fila<Curso> fila) {
        System.out.println("__________________");
        System.out.println(fila.toString());
        System.out.print("fila.desenfileirar() - removerá o item: ");
        System.out.println(fila.desenfileirar());

        System.out.println(fila.toString());
        System.out.println("__________________");
    }

    private static void pilhaAdd(Pilha<Curso> pilha) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("pilha.enfileirar(" + aux.toString() + ")");
        pilha.empilhar(aux);
        System.out.println(pilha.toString());
        System.out.println("__________________");
    }

    private static void pilhaRemove(Pilha<Curso> pilha) {
        System.out.println("__________________");
        System.out.println(pilha.toString());
        System.out.print("pilha.desenfileirar() - removerá o item: ");
        System.out.println(pilha.desempilhar());

        System.out.println(pilha.toString());

        System.out.println("__________________");
    }

    private static void listaEstaticaAddInicio(ListaEstatica<Curso> listaEstatica) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("listaEstatica.adicionaInicio(" + aux.toString() + ")");
        listaEstatica.adicionaInicio(aux);
        System.out.println(listaEstatica.percorre());
        System.out.println("__________________");
    }

    private static void listaEstaticaAddFim(ListaEstatica<Curso> listaEstatica) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("listaEstatica.adicionarFim(" + aux.toString() + ")");
        listaEstatica.adicionarFim(aux);
        System.out.println(listaEstatica.percorre());
        System.out.println("__________________");
    }

    private static void listaEstaticaAddQualquer(ListaEstatica<Curso> listaEstatica, int pos) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("listaEstatica.adicionaEspecifica(" + pos + ", " + aux.toString() + ")");
        listaEstatica.adicionaEspecifica(pos, aux);
        System.out.println(listaEstatica.percorre());
        System.out.println("__________________");
    }

    private static void listaEstaticaRemoveInicio(ListaEstatica<Curso> listaEstatica) {
        System.out.println("__________________");
        System.out.println(listaEstatica.percorre());
        System.out.print("listaEstatica.removeInicio() - removerá o item: ");
        System.out.println(listaEstatica.removeInicio());
        System.out.println(listaEstatica.percorre());
        System.out.println("__________________");
    }

    private static void listaEstaticaRemoveFim(ListaEstatica<Curso> listaEstatica) {
        System.out.println("__________________");
        System.out.println(listaEstatica.percorre());
        System.out.print("listaEstatica.removeFim() - removerá o item: ");
        System.out.println(listaEstatica.removeFim());
        System.out.println(listaEstatica.percorre());
        System.out.println("__________________");
    }

    private static void listaEstaticaRemoveQualquer(ListaEstatica<Curso> listaEstatica, int pos) {
        System.out.println("__________________");
        System.out.println(listaEstatica.percorre());
        System.out.print("listaEstatica.removeEspecifica() - removerá o item: ");
        System.out.println(listaEstatica.removeEspecifica(pos));
        System.out.println(listaEstatica.percorre());
        System.out.println("__________________");
    }

    private static void listaDinamicaSimplesAddInicio(ListaDinamicaSimples<Curso> listaDinamicaSimples) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("listaDinamicaSimples.adicionaInicio(" + aux.toString() + ")");
        listaDinamicaSimples.inserirInicio(aux);
        System.out.println(listaDinamicaSimples.toString());
        System.out.println("__________________");
    }

    private static void listaDinamicaSimplesAddFim(ListaDinamicaSimples<Curso> listaDinamicaSimples) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("listaDinamicaSimples.adicionarFim(" + aux.toString() + ")");
        listaDinamicaSimples.inserirFinal(aux);
        System.out.println(listaDinamicaSimples.toString());
        System.out.println("__________________");
    }

    private static void listaDinamicaSimplesAddQualquer(ListaDinamicaSimples<Curso> listaDinamicaSimples, int pos) {
        System.out.println("__________________");
        Curso aux;
        aux = curso();
        System.out.println("listaDinamicaSimples.adicionaEspecifica(" + pos + ", " + aux.toString() + ")");
        listaDinamicaSimples.inserirQualquer(aux, pos);
        System.out.println(listaDinamicaSimples.toString());
        System.out.println("__________________");
    }

    private static void listaDinamicaSimplesRemoveInicio(ListaDinamicaSimples<Curso> listaDinamicaSimples) {
        System.out.println("__________________");
        System.out.println(listaDinamicaSimples.toString());
        System.out.print("listaDinamicaSimples.removeInicio() - removerá o item: ");
        System.out.println(listaDinamicaSimples.removerInicio());
        System.out.println(listaDinamicaSimples.toString());
        System.out.println("__________________");
    }

    private static void listaDinamicaSimplesRemoveFim(ListaDinamicaSimples<Curso> listaDinamicaSimples) {
        System.out.println("__________________");
        System.out.println(listaDinamicaSimples.toString());
        System.out.print("listaDinamicaSimples.removeFim() - removerá o item: ");
        System.out.println(listaDinamicaSimples.removerFinal());
        System.out.println(listaDinamicaSimples.toString());
        System.out.println("__________________");
    }

    private static void listaDinamicaSimplesRemoveQualquer(ListaDinamicaSimples<Curso> listaDinamicaSimples, int pos) {
        System.out.println("__________________");
        System.out.println(listaDinamicaSimples.toString());
        System.out.print("listaDinamicaSimples.removeEspecifica() - removerá o item: ");
        System.out.println(listaDinamicaSimples.removerQualquer(pos));
        System.out.println(listaDinamicaSimples.toString());
        System.out.println("__________________");
    }


    private static Curso curso() {
        String area = numeruzin() == 1 ? "Humanas" :
                numeruzin() == 2 ? "Biológicas" :
                        numeruzin() == 3 ? "Exatas" : "Esotéricas";
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

    private static int numeruzin(int inicio, int fim) {
        return random.ints(inicio, fim)
                .findFirst()
                .getAsInt();
    }


}
