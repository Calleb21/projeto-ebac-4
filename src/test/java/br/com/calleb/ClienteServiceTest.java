package br.com.calleb;

import br.com.calleb.dao.ClienteDaoMock;
import br.com.calleb.dao.IClienteDAO;
import br.com.calleb.domain.Cliente;
import br.com.calleb.exceptions.DAOException;
import br.com.calleb.services.ClienteService;
import br.com.calleb.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Description of ClienteServiceTest
 * Created by calle on 09/01/2024.
 */
public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);

    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
}