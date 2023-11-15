package medicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class EspecialidadeTest {
    private Especialidade especialidade;

    @Before
    public void setUp() {
        especialidade = new Especialidade(1, "E001", "Cardiologia");
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(1, especialidade.getIdentificacao());
        assertEquals("E001", especialidade.getCodigo());
        assertEquals("Cardiologia", especialidade.getNome());

    }
}
