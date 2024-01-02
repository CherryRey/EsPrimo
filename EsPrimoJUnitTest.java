/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esprimo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cherry
 */
public class EsPrimoJUnitTest {

    public EsPrimoJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    

//Test probando la condición "False" con assertionFalse()// Cherry Reynoso
    @Test
    public void testprimoFalse() {
        System.out.println("El numero no es Primo; el test pasa");
        assertFalse(EsPrimo.primo(39));
    }

//Test probando la condición "True" con assertionTrue()  
  
    @Test
    public void testprimoTrue(){
        System.out.println("El número es Primo, el test pasa");
        assertTrue(EsPrimo.primo(3));
    }
    
// Test con casos al límite: Numeros negativos.
    @Test
    public void testprimoNegativo() {
        System.out.println("Probando numeros negativos");
        assertTrue(EsPrimo.primo(-3)); 
    }
}


/**
    @Test
    public void testprimoFalse_fail() {
        System.out.println("El número es Primo, el test falla a propósito");
        assertFalse("Ha fallado porque 3 es un número primo", EsPrimo.primo(3));
    }**/
    
