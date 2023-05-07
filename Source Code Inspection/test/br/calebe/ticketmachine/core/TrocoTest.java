/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrocoTest {
    /**
     * Test of getIterator method, of class Troco.
     */
    
    @Test
    public void verificarQuantidade() {
        int quantity = 52;
        PapelMoeda papelMoeda = new PapelMoeda(10, quantity);
        System.out.println(papelMoeda);
        assertEquals(papelMoeda.getQuantidade(), quantity);
    } 
    
    @Test
    public void verificarValor() {
        int value = 52;
        PapelMoeda papelMoeda = new PapelMoeda(value, 10);
        assertEquals(papelMoeda.getValor(), value);
    }   
 
    
}
