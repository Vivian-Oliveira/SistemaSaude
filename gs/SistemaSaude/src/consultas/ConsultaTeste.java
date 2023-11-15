package consultas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import medicos.Medico;
import pacientes.Paciente;

public class ConsultaTest {
    private Consulta consulta;
    private Paciente paciente;
    private Medico medico;

    @Before
    public void setUp() {
        paciente = new Paciente(1, "João", "123456789", "123456", "789456123", "Centro", "SP", new Date());
        medico = new Medico(1, "CRM123", "Dr. Silva", "987654321", "Cardiologia");
        consulta = new Consulta(1, medico, paciente, "Rotina", new Date());
    }

    @Test
    public void testExibirInformacoes() {
        String expected = "Consulta 1 - João (" + consulta.getDataConsulta() + ")";
        assertEquals(expected, consulta.exibirInformacoes());
    }

    @Test
    public void testGettersAndSetters() {
        assertNotNull(consulta.getPaciente());
        assertNotNull(consulta.getMedico());

        assertEquals(1, consulta.getIdentificacao());
        assertEquals("Rotina", consulta.getDescricao());

        // Adicione mais verificações conforme necessário para outros atributos
    }
}
