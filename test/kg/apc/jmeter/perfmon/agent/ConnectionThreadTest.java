/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kg.apc.jmeter.perfmon.agent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author APC
 */
public class ConnectionThreadTest {

    public ConnectionThreadTest() {
    }

   @BeforeClass
   public static void setUpClass() throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   @Test
   public void testRun()
   {
      System.out.println("run");
      ConnectionThread instance = null;
      instance.run();
      fail("The test case is a prototype.");
   }

}