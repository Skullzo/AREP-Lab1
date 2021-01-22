package edu.escuelaing.arep.app.calculos;
import  edu.escuelaing.arep.app.listas.ListaEnlazada;
/**
 * Clase encargada de realizar los calculos como son la Media, Varianza y Desviacion Estandar partiendo de la Lista Enlazada.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class Calculadora {
    /**
     * Metodo encargado de calcular la Media de los datos ingresados en el archivo de texto.
     * @param list Lista Enlazada que se encarga de almacenar los valores ingresados en el archivo de texto.
     * @return Retorna la Media de los datos del archivo de texto.
     */
	public static double media(ListaEnlazada<Double> list){
        double suma_valores = 0;
        for(int i = 0; i < list.getSize(); i++){
        	suma_valores += list.get(i);
        }
        return suma_valores / list.getSize();
    }
	/**
     * Metodo encargado de calcular la Varianza de los datos ingresados en el archivo de texto.
     * @param list Lista Enlazada que se encarga de almacenar los valores ingresados en el archivo de texto.
     * @return Retorna la Varianza de los datos del archivo de texto.
     */
	public static double varianza(ListaEnlazada<Double> list){
        double media = media(list);
        double suma_valores = 0;
        for(int i=0;i<list.getSize();i++){
        	suma_valores += Math.pow((list.get(i)-media),2);
        }
        double resultado = (suma_valores)/(list.getSize()-1);
        return resultado;
    }
    /**
     * Metodo encargado de calcular la Desviacion Estandar de los datos ingresados en el archivo de texto.
     * @param list Lista Enlazada que se encarga de almacenar los valores ingresados en el archivo de texto.
     * @return Retorna la Desviacion Estandar de los datos del archivo de texto.
     */
    public static double desviacionEstandar(ListaEnlazada<Double> list){
        double varianza = varianza(list);
        double resultado = Math.sqrt(varianza);
        return resultado;
    }
}