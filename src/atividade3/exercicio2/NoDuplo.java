package atividade3.exercicio2;

public class NoDuplo<T> {
    private T item;
    private NoDuplo<T> proximo;
    private NoDuplo<T> anterior;


    public NoDuplo(T item) {
        this.item = item;
        this.proximo = null;
        this.anterior = null;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
