package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.calculos.Calculadora;
import edu.escuelaing.arep.app.listas.ListaEnlazada;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Caso de prueba para las comprovar si se estan haciendo correctamenta los calculos.
     */
    @Test
    public void MeanDeviationTest1() {
        ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(15.5);elementos.add(10.89);elementos.add(165.5);elementos.add(156.5);elementos.add(5.55);
        elementos.add(59.1);elementos.add(33.5);elementos.add(88.78);elementos.add(99.0);

        double mean = Calculadora.media(elementos);
        double deviation = Calculadora.desviacionEstandar(elementos);
        assertEquals(70.48 ,mean,0.01);
        assertEquals(61.097482967795,deviation, 0.01);
    }
    /**
     * Caso de prueba para las comprovar si se estan haciendo correctamenta los calculos.
     */
    @Test
    public void MeanDeviationTest2() {
    	ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(186.0);elementos.add(699.0);elementos.add(132.0);elementos.add(272.0);elementos.add(291.0);
        elementos.add(331.0);elementos.add(199.0);elementos.add(1890.0);elementos.add(788.0);elementos.add(1601.0);

        double mean = Calculadora.media(elementos);
        double deviation = Calculadora.desviacionEstandar(elementos);
        assertEquals(638.9 ,mean,0.01);
        assertEquals(625.6339806770231,deviation, 0.01);
    }
    /**
     * Caso de prueba para las comprovar si se estan haciendo correctamenta los calculos.
     */
    @Test
    public void MeanDeviationTest3() {
    	ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(15.0);elementos.add(596.87);elementos.add(465.13);elementos.add(848.65);elementos.add(5.0);
        elementos.add(6546.65);elementos.add(100.2);elementos.add(53.58);elementos.add(22.22);elementos.add(33.33);

        double mean = Calculadora.media(elementos);
        double deviation = Calculadora.desviacionEstandar(elementos);
        assertEquals(868.6629999999999 ,mean,0.01);
        assertEquals(2017.1609354847112,deviation, 0.01);
    }
}
