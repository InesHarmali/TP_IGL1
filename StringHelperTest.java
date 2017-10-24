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
        String chaine = " la maison - ABCXYZ";
        String expResult = " mb nbjtpo - BCDYZA";
        String result = StringHelper.formule_lettre_suivante(chaine);
        assertEquals(expResult, result);
    }

    /**
     * Test of fractioner_string method, of class StringHelper.
     */
    @Test
    public void testFractioner_string() {
        System.out.println("fractioner_string");
        String texte = "  Building tree for all the packages and classes.";
        char separateur = ' ';
        String[] expResult = {"Building","tree","for","all","the","packages","and","classes."};
        String[] result = StringHelper.fractioner_string(texte, separateur);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of mise_en_forme_texte method, of class StringHelper.
     */
    @Test
    public void testMise_en_forme_texte() {
        System.out.println("mise_en_forme_texte");
        String texte = " loaDING THE filES . USE giTHUB";
        String expResult = " Loading the files . Use github";
        String result = StringHelper.mise_en_forme_texte(texte);
        assertEquals(expResult, result);
    }

    /**
     * Test of Nombre_Occurence method, of class StringHelper.
     */
    @Test
    public void testNombre_Occurence() throws Exception {
        System.out.println("Nombre_Occurence");
        String texte = "The test case test case tesst test";
        String mot = "test";
        int expResult = 3;
        int result = StringHelper.Nombre_Occurence(texte, mot);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of Nombre_Occurence method, of class StringHelper.
     * @throws java.lang.Exception
     */
    @Test (expected=Texte_vide_Exception.class)
    public void test1Nombre_Occurence() throws Exception {
        System.out.println("Nombre_Occurence");
        String texte = "";
        String mot = "test";
        StringHelper.Nombre_Occurence(texte, mot);
    }
    
    

    /**
     * Test of Jointure_Table method, of class StringHelper.
     */
    @Test
    public void testJointure_Table() {
        System.out.println("Jointure_Table");
        String[] tab ={"la","grande","maison","est","blanche"};
        String sper = "-";
        String expResult = "la-grande-maison-est-blanche-";
        String result = StringHelper.Jointure_Table(tab, sper);
        assertEquals(expResult, result);
    }

    /**
     * Test of EliminationMotvide method, of class StringHelper.
     */
    @Test
    public void testEliminationMotvide() {
        System.out.println("EliminationMotvide");
        String chaine = "Ecole et nationale non superieure ou et ou d'informatique";
        String expResult = "Ecole nationale superieure d'informatique ";
        String result = StringHelper.EliminationMotvide(chaine);
        assertEquals(expResult, result);
    }
    
}
