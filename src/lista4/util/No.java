package lista4.util;

public class No<T> {
    private T item;
    private No<T> proximo;

    public No(T item) {
        this.item = item;
        this.proximo = null;
    }

    public No<T> getProximo(){
        return proximo;
    }

    public void setProximo(No<T> proximo){
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
