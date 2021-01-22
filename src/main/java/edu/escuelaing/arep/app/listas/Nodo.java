package edu.escuelaing.arep.app.listas;

import edu.escuelaing.arep.app.listas.Nodo;

/**
 * Clase encargada de todos los nodos en los cuales se almacena la informacion.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class Nodo<E> {
    private E data;
    private Nodo<E> next = null;
    private Nodo<E> prior = null;
    /**
     * Metodo constructor de la clase Nodo.
     */
    public Nodo() {
    }
    /**
     * Metodo constructor de la clase Nodo.
     * @param data Parametro que ingresa la informacion que se va a almacenar en el nodo.
     */
    public Nodo(E data) {
        this.data = data;
    }
    /***
     * Metodo encargado de actualizar la informacion que se almacena en este nodo.
     * @param data Parametro que representa la nueva informacion que se va a almacenar en el nodo.
     */
    public void setData(E data) {
        this.data = data;
    }
    /**
     * Metodo encargado de actualizar los nodos siguientes.
     * @param next Parametro que representa el nuevo nodo siguiente.
     */
    public void setNext(Nodo<E> next) {
        this.next = next;
    }
    /**
     * Metodo que se encarga de obtener la informacion que almacena el nodo.
     * @return Retorna los datos del nodo en cuestion.
     */
    public E getData() {
        return data;
    }
    /**
     * Metodo que se encarga de obtener el nodo siguiente.
     * @return Retorna el nodo siguiente.
     */
    public Nodo<E> getNext() {
        return next;
    }
    /**
     * Metodo que se encarga de obtener el nodo anterior.
     * @return Retorna el nodo anterior.
     */
    public Nodo<E> getPrior() {
        return prior;
    }
    /**
     * Metodo que se encarga de actualizar el nodo anterior.
     * @param prior Parametro que indica el nuevo nodo anterior.
     */
    public void setPrior(Nodo<E> prior) {
        this.prior = prior;
    }
}