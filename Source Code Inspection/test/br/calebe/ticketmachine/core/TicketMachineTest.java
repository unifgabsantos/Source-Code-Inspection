package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
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
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    /**
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void verifyInserirTicket50() throws PapelMoedaInvalidaException {
        TicketMachine ticketMachine = new TicketMachine(3);
        ticketMachine.inserir(50);
        assertEquals(ticketMachine.getSaldo(), 50);
    }
    
}
