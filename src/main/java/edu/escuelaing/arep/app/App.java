package main.java.edu.escuelaing.arep.app;
import main.java.edu.escuelaing.arep.app.calculos.Calculadora;
import main.java.edu.escuelaing.arep.app.listas.ListaEnlazada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
public class App {
    /**
     * Metodo principal de la clase App.
     * @param args Lista de los elementos que se quieren evaluar.
     */
    public static void main( String[] args ) {
        try {
        	ListaEnlazada<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("data.txt"));
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
            System.out.println("Error.");
        }
    }

    /**
     * Obtiene la media y la desviación estandar de los datos ingresados.
     * @param elementos Lista que contiene los elementos a evaluar.
     */
    public static void calcular(ListaEnlazada<Double> elementos){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        double mean = Calculadora.media(elementos);
        double deviation = Calculadora.desviacionEstandar(elementos);
        System.out.println("Mean: " + twoDForm.format(mean) + " Deviation: "+ twoDForm.format(deviation));
    }
}
