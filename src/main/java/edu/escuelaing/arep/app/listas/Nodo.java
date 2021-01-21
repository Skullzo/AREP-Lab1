package main.java.edu.escuelaing.arep.app.listas;
/**
 * Clase encargada de todos los nodos en los cuales se almacena la información.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class Nodo<E> {
    private E data;
    private Nodo<E> next = null;
    private Nodo<E> prior = null;
    /**
     * Método constructor de la clase Nodo.
     */
    public Nodo() {
    }
    /**
     * Método constructor de la clase Nodo.
     * @param data Parámetro que ingresa la información que se va a almacenar en el nodo.
     */
    public Nodo(E data) {
        this.data = data;
    }
    /***
     * Método encargado de actualizar la información que se almacena en este nodo.
     * @param data Parámetro que representa la nueva información que se va a almacenar en el nodo.
     */
    public void setData(E data) {
        this.data = data;
    }
    /**
     * Método encargado de actualizar los nodos siguientes.
     * @param next Parámetro que representa el nuevo nodo siguiente.
     */
    public void setNext(Nodo<E> next) {
        this.next = next;
    }
    /**
     * Método que se encarga de obtener la información que almacena el nodo.
     * @return Retorna los datos del nodo en cuestión.
     */
    public E getData() {
        return data;
    }
    /**
     * Método que se encarga de obtener el nodo siguiente.
     * @return Retorna el nodo siguiente.
     */
    public Nodo<E> getNext() {
        return next;
    }
    /**
     * Método que se encarga de obtener el nodo anterior.
     * @return Retorna el nodo anterior.
     */
    public Nodo<E> getPrior() {
        return prior;
    }
    /**
     * Método que se encarga de actualizar el nodo anterior.
     * @param prior Parámetro que indica el nuevo nodo anterior.
     */
    public void setPrior(Nodo<E> prior) {
        this.prior = prior;
    }
}