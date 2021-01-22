package edu.escuelaing.arep.app;
import edu.escuelaing.arep.app.calculos.Calculadora;
import edu.escuelaing.arep.app.listas.ListaEnlazada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
/**
 * Clase encargada de llevar a cabo la ejecucion de todo el programa.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class App {
    /**
     * Metodo principal main que se encarga del funcionamiento de toda la clase App.
     * @param args Parametro que indica la lista de los elementos a evaluar.
     */
    public static void main( String[] args ) {
        try {
        	ListaEnlazada<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("Valores.txt"));
            double n;
            while ((sCadena = bf.readLine())!=null) {
                elementos = new ListaEnlazada<Double>();
                String[] lista = sCadena.split(" ");
                for (String elemento: lista){
                    n = Double.parseDouble(elemento);
                    elementos.add(n);
                }
                calcular(elementos);
            }
            bf.close();
        }catch (Exception  e){
            System.out.println("Se ha presentado un Error.");
        }
    }
    /**
     * Metodo encargado de obtener la media y la desviacion estandar (obtenida a traves de la varianza) de los datos ingresados.
     * @param elementos Parametro que indica los elementos de la lista.
     */
    public static void calcular(ListaEnlazada<Double> elementos){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        System.out.println("Media: " + twoDForm.format(media) + ", Desviación Estándar: "+ twoDForm.format(desviacionEstandar));
    }
}