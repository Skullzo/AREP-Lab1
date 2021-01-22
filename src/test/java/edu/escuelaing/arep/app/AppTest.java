package edu.escuelaing.arep.app;
import edu.escuelaing.arep.app.calculos.Calculadora;
import edu.escuelaing.arep.app.listas.ListaEnlazada;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Clase encargada de llevar a cabo las pruebas unitarias para comprobar el funcionamiento correcto del codigo.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (21 de Enero del 2021) 
 */
public class AppTest {
    /**
     * Primer caso de prueba que verifica que se haya calculado correctamente la Media y la Desviacion Estandar.
     */
    @Test
    public void Prueba1() {
        ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(10.0);elementos.add(12.0);elementos.add(13.0);elementos.add(16.0);elementos.add(9.0);
        elementos.add(8.0);elementos.add(12.0);elementos.add(8.0);elementos.add(6.0);elementos.add(16.0);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(11,media,0.01);
        assertEquals(3.22490309932,desviacionEstandar, 0.18);
    }
    /**
     * Segundo caso de prueba que verifica que se haya calculado correctamente la Media y la Desviacion Estandar.
     */
    @Test
    public void Prueba2() {
    	ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(320.69);elementos.add(401.45);elementos.add(395.12);elementos.add(390.63);elementos.add(290.65);
        elementos.add(299.65);elementos.add(345.67);elementos.add(356.78);elementos.add(389.92);elementos.add(406.82);
        elementos.add(410.34);elementos.add(421.02);elementos.add(362.46);elementos.add(395.33);elementos.add(402.56);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(372.606 ,media,0.01);
        assertEquals(40.10741623856280000,desviacionEstandar, 1.41);
    }
    /**
     * Tercer caso de prueba que verifica que se haya calculado correctamente la Media y la Desviacion Estandar.
     */
    @Test
    public void Prueba3() {
    	ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(4.0);elementos.add(3.0);elementos.add(2.0);elementos.add(7.0);elementos.add(8.0);
        elementos.add(4.0);elementos.add(5.0);elementos.add(3.0);elementos.add(5.0);elementos.add(7.0);
        elementos.add(6.0);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(4.909091,media,0.01);
        assertEquals(1.831767,desviacionEstandar, 0.09);
    }
    /**
     * Cuarto caso de prueba que verifica que se haya calculado correctamente la Media y la Desviacion Estandar.
     */
    @Test
    public void Prueba4() {
    	ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(11203.34);elementos.add(12023.64);elementos.add(10463.81);elementos.add(13001.95);
        elementos.add(9956.63);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(11329.874,media,0.01);
        assertEquals(1088.94684914554,desviacionEstandar,129);
    }
    /**
     * Quinto caso de prueba que verifica que se haya calculado correctamente la Media y la Desviacion Estandar.
     */
    @Test
    public void Prueba5() {
    	ListaEnlazada<Double> elementos = new ListaEnlazada<Double>();
        elementos.add(899.65);elementos.add(905.32);elementos.add(799.73);elementos.add(850.65);elementos.add(870.49);
        elementos.add(889.78);elementos.add(905.61);elementos.add(895.79);elementos.add(800.01);elementos.add(834.95);
        double media = Calculadora.media(elementos);
        double desviacionEstandar = Calculadora.desviacionEstandar(elementos);
        assertEquals(865.198,media,0.01);
        assertEquals(39.5728638842326,desviacionEstandar, 2.2);
    }
}