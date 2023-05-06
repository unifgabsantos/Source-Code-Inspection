/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.calebe.ticketmachine.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unifgabsantos
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @Test
    public void verifyQuantity() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 5);
        assertEquals(papelMoeda.getQuantidade(), 5);
    }
    
}
