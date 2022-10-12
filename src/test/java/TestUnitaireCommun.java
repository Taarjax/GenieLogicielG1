/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bd852763
 */

import controller.TestUtils;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import model.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnitaireCommun {
    
    private Banane b;
    private Cerise c;
    private static FruitSimple f;
    
    public TestUnitaireCommun(){
        
    }
    
    
    @Before
    public void setUp() {
       b = new Banane(2.1, "Maroc");
       c = new Cerise(5.0, "Belgique");
       f = new FruitSimple(-3.2, "France") {};
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testIncr() {
        System.out.println("Test ajout Banane");
        System.out.println("Banane " +b.toString());
        System.out.println("Test ajout Cerise");
        System.out.println("Cerise " +c.toString());
        System.out.println("Test Fruit Simple"  +f.toString());     
    }
    
    @Test
    public void testDecrOk() {
        
       
    }
    
    @Test
    public void testDecrZero() {
        
    }
    
}
