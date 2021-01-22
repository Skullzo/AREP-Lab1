package edu.escuelaing.arep.app.listas;
import java.util.Iterator;
/**
 * Clase encargada de manejar el Iterador encargado de desplazarse entre los nodos de la Lista Enlazada.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021)
 */
public class Iterador<E> implements Iterator<E> {
    Nodo<E> current;
    /**
     * Metodo constructor de la clase Iterador.
     * @param actual Nodo en el que se encuentra el Iterador.
     */
    public Iterador(Nodo<E> actual) {
        current = actual;
    }
    /**
     * Metodo encargado de realizar la respectiva verificacion si el actual nodo tiene un nodo siguiente.
     * @return boolean
     */
    public boolean hasNext() {
        return current != null;
    }
    /**
     * Metodo encargado de obtener el valor del nodo actual.
     * @return E Elemento.
     */
    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }
    public void remove() {}
}