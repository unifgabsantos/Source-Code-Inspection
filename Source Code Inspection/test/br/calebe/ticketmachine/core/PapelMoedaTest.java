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
        int quantity = 12;
        PapelMoeda papelMoeda = new PapelMoeda(10, quantity);
        assertEquals(papelMoeda.getQuantidade(), quantity);
    }

    @Test
    public void verifyValue() {
        int value = 12;
        PapelMoeda papelMoeda = new PapelMoeda(value, 10);
        assertEquals(papelMoeda.getValor(), value);
    }  
}
