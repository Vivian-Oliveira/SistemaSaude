package usuarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
    private Usuario usuario;

    @Before
    public void setUp() {
        usuario = new Usuario("meulogin", "minhasenha");
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals("meulogin", usuario.getLogin());
        assertEquals("minhasenha", usuario.getSenha());

    }
}
