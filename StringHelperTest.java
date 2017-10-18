/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INES10
 */
public class StringHelperTest {
    
    public StringHelperTest() {
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
     * Test of formule_lettre_suivante method, of class StringHelper.
     */
    @Test
    public void testFormule_lettre_suivante() {
        System.out.println("formule_lettre_suivante");
        String chaine = "";
        String expResult = "";
        String result = StringHelper.formule_lettre_suivante(chaine);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fractioner_string method, of class StringHelper.
     */
    @Test
    public void testFractioner_string() {
        System.out.println("fractioner_string");
        String texte = "";
        char separateur = ' ';
        String[] expResult = null;
        String[] result = StringHelper.fractioner_string(texte, separateur);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mise_en_forme_texte method, of class StringHelper.
     */
    @Test
    public void testMise_en_forme_texte() {
        System.out.println("mise_en_forme_texte");
        String texte = "";
        String expResult = "";
        String result = StringHelper.mise_en_forme_texte(texte);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of occurence_mot method, of class StringHelper.
     */
    @Test
    public void testOccurence_mot() {
        System.out.println("occurence_mot");
        String Texte = "";
        String mot = "";
        int expResult = 0;
        int result = StringHelper.occurence_mot(Texte, mot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
