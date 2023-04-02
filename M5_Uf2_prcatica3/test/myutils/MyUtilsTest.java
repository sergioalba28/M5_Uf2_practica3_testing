/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class MyUtilsTest {

    public MyUtilsTest() {
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

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteixCadena() {
        System.out.println("inverteix | Sergio --> oigreS");
        String cadena = "Sergio";
        String expResult = "oigreS";
        String result = MyUtils.inverteixCadena(cadena);
        assertEquals(expResult, result);

        System.out.println("inverteix1 | Null --> lluN");
        String cadena_1 = "Null";
        String expResult_1 = "lluN";
        String result_1 = MyUtils.inverteixCadena(cadena_1);
        assertEquals(expResult_1, result_1);

        System.out.println("inverteix2 | " + null + " --> " + null);
        String cadena_2 = null;
        String expResult_2 = null;
        String result_2 = MyUtils.inverteixCadena(cadena_2);
        assertEquals(expResult_2, result_2);
        
        System.out.println("");
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat | 18/05/1992 = 30");
        int dia = 28;
        int mes = 5;
        int anyo = 1992;
        int expResult = 30;
        int result = MyUtils.edat(dia, mes, anyo);
        assertEquals(expResult, result);

        System.out.println("edat1 | 03/04/-1022 = -2");
        int dia1 = 3;
        int mes1 = 4;
        int anyo1 = -1022;
        int expResult1 = -2;
        int result1 = MyUtils.edat(dia1, mes1, anyo1);
        assertEquals(expResult1, result1);

        System.out.println("edat2 | año 28/05/1550 = -1");
        int dia2 = 28;
        int mes2 = 5;
        int anyo2 = 1550;
        int expResult2 = -1;
        int result2 = MyUtils.edat(dia2, mes2, anyo2);
        assertEquals(expResult2, result2);
        
        System.out.println("");
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial | 4! = 24");
        double numero = 4.0;
        double expResult = 24.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0.0);

        System.out.println("factorial1 | 3! = 6");
        double numero1 = 3.0;
        double expResult1 = 6.0;
        double result1 = MyUtils.factorial(numero1);
        assertEquals(expResult1, result1, 0.0);

        System.out.println("factorial2 | -22! = -1");
        double numero2 = -22.0;
        double expResult2 = -1;
        double result2 = MyUtils.factorial(numero2);
        assertEquals(expResult2, result2, 0.0);
        
        System.out.println("");

    }

}
