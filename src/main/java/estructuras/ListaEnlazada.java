package estructuras;

public class ListaEnlazada<T> {

    private Nodo<T> first;
    private Nodo<T> last;

    public boolean add(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);

        // La lista esta vacia
        if (first == null){
            first = nuevo;
            last = nuevo;
        }
        // La lista tiene elementos
        else {
            last.setNext(nuevo);
            last = nuevo;
        }
        return true;
    }

    public T getData(int index){
        Nodo<T> actual = first;
        int contador = 0;

        while (actual != null){
            if (contador == index){
                return actual.getDato();
            }
            actual = actual.getNext();
            contador++;
        }
        return  null;
    }

    public boolean search(T dato){
        Nodo<T> actual = first;

        while (actual != null){
            if (actual.getDato().equals(dato)){
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public T delete(T dato){
        Nodo<T> actual = first;

        // Lista Vacia
        if (first == null){
            return null;
        }

        // Lista con un solo dato
        if (first.getDato().equals(dato)){
            T eliminado = first.getDato();
            first = first.getNext();

            if (first == null){ // Si la lista quedo sin elementos
                last = null;
            }

            return eliminado;
        }

        // EL dato a eliminar es el ultimo
        else if (last.getDato().equals(dato)){
            T eliminado = last.getDato();
            Nodo<T> actualNode = first;

            while (actualNode != null){
                if (actualNode.getNext() == last){
                    actualNode.setNext(null);
                    last = actualNode;
                    return eliminado;
                }
                actualNode = actualNode.getNext();
            }

        }
        while (actual.getNext() != null){
            if (actual.getNext().getDato().equals(dato)){
                T eliminado = actual.getNext().getDato();
                actual.setNext(actual.getNext().getNext());


                if (actual.getNext() == null){
                    last = actual;
                }
                return eliminado;
            }
            actual = actual.getNext();
        }
        return null;
    }
}
