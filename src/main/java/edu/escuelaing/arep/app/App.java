package main.java.edu.escuelaing.arep.app;
import main.java.edu.escuelaing.arep.app.calculos.Calculadora;
import main.java.edu.escuelaing.arep.app.listas.ListaEnlazada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
/**
 * Clase encargada de llevar a cabo la ejecuci�n de todo el programa.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class App {
    /**
     * M�todo principal main que se encarga del funcionamiento de toda la clase App.
     * @param args Par�metro que indica la lista de los elementos a evaluar.
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
     * M�todo encargado de obtener la media y la desviaci�n est�ndar (obtenida a trav�s de la varianza) de los datos ingresados.
     * @param elementos Par�metro que indica los elementos de la lista.
     */
    public static void calcular(ListaEnlazada<Double> elementos){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        System.out.println("Media: " + twoDForm.format(media) + ", Desviaci�n Est�ndar: "+ twoDForm.format(desviacionEstandar));
    }
}