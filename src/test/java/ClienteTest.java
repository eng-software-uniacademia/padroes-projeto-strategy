import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveCalcularPisCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularPis(80.0f, 10.0f);
        assertEquals(81.54f, cliente.getImposto(), 0.2);
    }

    @Test
    void deveCalcularCofinsCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularCofins(80.0f, 20.0f);
        assertEquals(105.6f, cliente.getImposto());
    }
}