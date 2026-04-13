package gestor;

import estructuras.ListaEnlazada;

public class Gestor<T> {

    private ListaEnlazada<T> lista;

    public Gestor() {
        this.lista = new ListaEnlazada<>();
    }

    public void add(T elemento) {
        lista.add(elemento);
    }


    public T obtain(int indice) {
        return lista.obtain(indice);
    }


    public T search(T elemento) {
        return lista.search(elemento);
    }


    public T delete(T elemento) {
        return lista.delete(elemento);
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}