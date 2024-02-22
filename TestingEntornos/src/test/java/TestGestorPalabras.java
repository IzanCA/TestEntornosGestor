

import org.dam.exceptions.intComoString;
import org.dam.exceptions.stringVacioException;

import static junit.framework.Assert.assertEquals;
import org.dam.exceptions.LenghtMenor2;
import org.dam.exceptions.SimbolException;
import org.dam.testingentornos.GestorPalabras;
import org.junit.Test;

public class TestGestorPalabras {

    
    //Invertir palabras
    @Test
    public void invertirPalabra() throws Exception {
        GestorPalabras g = new GestorPalabras();
        assertEquals("manzana", g.invertirPalabra("anaznam"));        
    }
    
    @Test
    public void invertirLetra() throws Exception {
        GestorPalabras g = new GestorPalabras();
        assertEquals("a", g.invertirPalabra("a"));        
    }
    
    @Test
    public void invertirNumeros() throws Exception {
        GestorPalabras g = new GestorPalabras();
        assertEquals("4321", g.invertirPalabra("1234"));        
    }
    
    @Test
    public void invertirSimbolos() throws Exception {
        GestorPalabras g = new GestorPalabras();
        assertEquals("@@++", g.invertirPalabra("++@@"));        
    }
    
    @Test
    public void invertirEspacios() throws Exception {
        GestorPalabras g = new GestorPalabras();
        assertEquals("a    a", g.invertirPalabra("a    a"));        
    }

    //Contar Vocales
    
    @Test
    public void contarBien() throws stringVacioException {
        GestorPalabras g = new GestorPalabras();
        assertEquals(3, g.contarVocales("avion"));

    }

    @Test
    public void contarTildes() throws stringVacioException {
        GestorPalabras g = new GestorPalabras();
        assertEquals(3, g.contarVocales("avión"));
    }

    @Test
    public void contarConEspacios() throws stringVacioException {
        GestorPalabras g = new GestorPalabras();
        assertEquals(3, g.contarVocales("a vión"));
    }

    @Test
    public void contarMayusculas() throws stringVacioException {
        GestorPalabras g = new GestorPalabras();
        assertEquals(3, g.contarVocales("AVIÓN"));
    }

    @Test(expected = stringVacioException.class)
    public void contarVacio() throws stringVacioException {
        GestorPalabras g = new GestorPalabras();
        g.contarVocales("");
    }
}
