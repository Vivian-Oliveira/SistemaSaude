package medicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MedicoTest {
    private Medico medico;

    @Before
    public void setUp() {
        medico = new Medico(1, "CRM123", "Dr. Silva", "987654321", "Cardiologia");
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(1, medico.getIdentificacao());
        assertEquals("CRM123", medico.getCrm());
        assertEquals("Dr. Silva", medico.getNome());
        assertEquals("987654321", medico.getTelefone());
        assertEquals("Cardiologia", medico.getEspecialidade());

    }
}
