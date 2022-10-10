
import controller.TestUtils;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import model.Panier;
import vue.VueAWT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author cd554979
 */
public class TestVueAWT {
    private static VueAWT vueg;
    private Panier m;

    @Before
    public void setUp() {
        vueg = new VueAWT();
        m = new Panier(3);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testIncr() {
        System.out.println("incr");
        assertNotNull(vueg);  // Instantiated?
        Label res = (Label)TestUtils.getChildNamed(vueg, "Affichage");
        assertNotNull(res); // Component found?
        final Button plus = (Button)TestUtils.getChildNamed(vueg, "Plus");
        assertNotNull(plus);
        
        //tests d'acceptation (de l'interface) : 
        //plus.doClick(); //ne marche pas avec AWT
        ActionEvent ae = new ActionEvent((Object)plus, ActionEvent.ACTION_PERFORMED, "");
        plus.dispatchEvent(ae);
        assertEquals(res.getText(), "1");
        plus.dispatchEvent(ae); 
        assertEquals(res.getText(), "2");
    }
    
    @Test
    public void testDecrOk() {
        System.out.println("decr");
        assertNotNull(vueg);  // Instantiated?
        Label res = (Label)TestUtils.getChildNamed(vueg, "Affichage");
        assertNotNull(res); // Component found?
        final Button plus = (Button)TestUtils.getChildNamed(vueg, "Plus");
        assertNotNull(plus);
        final Button minus = (Button)TestUtils.getChildNamed(vueg, "Moins");
        assertNotNull(minus);
        
        //tests d'acceptation (de l'interface) : 
        //plus.doClick(); //ne marche pas avec AWT
        ActionEvent ae = new ActionEvent((Object)plus, ActionEvent.ACTION_PERFORMED, "");
        plus.dispatchEvent(ae); 
        assertEquals(res.getText(), "1");
        
        ActionEvent ae2 = new ActionEvent((Object)minus, ActionEvent.ACTION_PERFORMED, "");
        minus.dispatchEvent(ae2); 
        assertEquals(res.getText(), "0");
    }
    
    @Test
    public void testDecrZero() {
        System.out.println("remove");
        assertNotNull(vueg);  // Instantiated?
        Label res = (Label)TestUtils.getChildNamed(vueg, "Affichage");
        assertNotNull(res); // Component found?
        final Button minus = (Button)TestUtils.getChildNamed(vueg, "Moins");
        assertNotNull(minus);
        
        //tests d'acceptation (de l'interface) : 
        ActionEvent ae = new ActionEvent((Object)minus, ActionEvent.ACTION_PERFORMED, "");
        minus.dispatchEvent(ae); 
        assertEquals(res.getText(), "0");
    }
}
