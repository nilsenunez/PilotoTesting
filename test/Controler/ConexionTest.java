
package Controler;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConexionTest {
    
    @Test
    public void testGetConexionn() {
        System.out.println("getConexionn");
        Conexion instance = null;
        Connection expResult = null;
        Connection result = instance.getConexionn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarConexion method, of class Conexion.
     */
    @Test
    public void testCerrarConexion() {
        System.out.println("cerrarConexion");
        Conexion instance = null;
        //Connection expResult = null;
        Connection result = instance.cerrarConexion();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
