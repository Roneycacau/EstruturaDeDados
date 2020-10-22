package atividade3.exercicio2;

public class NoSimples<T> {
    private T item;
    private NoSimples<T> proximo;

    public NoSimples(T item) {
        this.item = item;
        this.proximo = null;
    }

    public NoSimples<T> getProximo(){
        return proximo;
    }

    public void setProximo(NoSimples<T> proximo){
        this.proximo = proximo;
    }

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
