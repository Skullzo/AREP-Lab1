package main.java.edu.escuelaing.arep.app.listas;
/**
 * Clase encargada de todos los nodos en los cuales se almacena la informaci�n.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class Nodo<E> {
    private E data;
    private Nodo<E> next = null;
    private Nodo<E> prior = null;
    /**
     * M�todo constructor de la clase Nodo.
     */
    public Nodo() {
    }
    /**
     * M�todo constructor de la clase Nodo.
     * @param data Par�metro que ingresa la informaci�n que se va a almacenar en el nodo.
     */
    public Nodo(E data) {
        this.data = data;
    }
    /***
     * M�todo encargado de actualizar la informaci�n que se almacena en este nodo.
     * @param data Par�metro que representa la nueva informaci�n que se va a almacenar en el nodo.
     */
    public void setData(E data) {
        this.data = data;
    }
    /**
     * M�todo encargado de actualizar los nodos siguientes.
     * @param next Par�metro que representa el nuevo nodo siguiente.
     */
    public void setNext(Nodo<E> next) {
        this.next = next;
    }
    /**
     * M�todo que se encarga de obtener la informaci�n que almacena el nodo.
     * @return Retorna los datos del nodo en cuesti�n.
     */
    public E getData() {
        return data;
    }
    /**
     * M�todo que se encarga de obtener el nodo siguiente.
     * @return Retorna el nodo siguiente.
     */
    public Nodo<E> getNext() {
        return next;
    }
    /**
     * M�todo que se encarga de obtener el nodo anterior.
     * @return Retorna el nodo anterior.
     */
    public Nodo<E> getPrior() {
        return prior;
    }
    /**
     * M�todo que se encarga de actualizar el nodo anterior.
     * @param prior Par�metro que indica el nuevo nodo anterior.
     */
    public void setPrior(Nodo<E> prior) {
        this.prior = prior;
    }
}