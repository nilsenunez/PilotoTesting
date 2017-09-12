/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAMSUNG
 */
public class ClientesTest {
    
    public ClientesTest() {
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
     * Test of getId method, of class Clientes.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Clientes instance = new Clientes();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Clientes.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Clientes instance = new Clientes();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCi method, of class Clientes.
     */
    @Test
    public void testGetCi() {
        System.out.println("getCi");
        Clientes instance = new Clientes();
        int expResult = 2848456;
        int result = instance.getCi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCi method, of class Clientes.
     */
    @Test
    public void testSetCi() {
        System.out.println("setCi");
        int ci = 0;
        Clientes instance = new Clientes();
        instance.setCi(ci);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Clientes.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Clientes instance = new Clientes();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Clientes.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Clientes instance = new Clientes();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
