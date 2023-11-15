package pacientes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class PacienteTest {
    private Paciente paciente;

    @Before
    public void setUp() {
        paciente = new Paciente(1, "João", "123456789", "123456", "789456123", "Centro", "SP", new Date());
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(1, paciente.getIdentificacao());
        assertEquals("João", paciente.getNome());
        assertEquals("123456789", paciente.getTelefone());
        assertEquals("123456", paciente.getRg());
        assertEquals("789456123", paciente.getCpf());
        assertEquals("Centro", paciente.getBairro());
        assertEquals("SP", paciente.getEstado());
        assertNotNull(paciente.getDataNascimento());
    }
}
