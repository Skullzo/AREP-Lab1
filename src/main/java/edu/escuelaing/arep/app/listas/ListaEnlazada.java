package edu.escuelaing.arep.app.listas;
import java.util.Iterator;
/**
 * Clase encargada de llevar a cabo la Lista Enlazada, para luego proceder a realizar los calculos de la Media, Varianza y Desviación Estándar respectivamente.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class ListaEnlazada<E> implements Iterable<E> {
    private Nodo<E> head = new Nodo<E>();
    private int size = 0;
    /**
     * Método encargado de agregar un nuevo nodo a la Lista Enlazada.
     * @param node Parámetro que representa el nuevo nodo.
     * @return boolean
     */
    public boolean add(E node) {
    	Nodo<E> actual = new Nodo<E>(node);
        if (size == 0) {
            head.setPrior(actual);
            head.setNext(actual);
        } else {
            head.getNext().setNext(actual);
            head.setNext(actual);
        }
        size++;
        return true;
    }
    /**
     * Método encargado de obtener un elemento dentro de la Lista Enlazada.
     * @param index Parámetro encargado de indicar la posición del elemento en cuestión.
     * @return Retorna el dato del nodo respectivamente.
     */
    public E get(int index) {
        if (index < 0 || index < size) {
            int pos = 0;
            Iterator<E> iterador = iterator();
            while (pos != index) {
                iterador.next();
                pos++;
            }
            return iterador.next();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * Método encargado de obtener el tamaño que tiene la Lista Enlazada.
     * @return Retorna el tamaño que tiene la Lista Enlazada.
     */
    public int getSize() {
        return size;
    }
    /**
     * Método encargado de crear un iterador para desplazarse entre los elementos de la Lista Enlazada.
     * @return Retorna el Iterador de la Lista Enlazada.
     */
    public Iterator<E> iterator()
    {
        return new Iterador<E>(head.getPrior());
    }
}