package br.com.calleb.dao.jpa;


import br.com.calleb.dao.generic.jpa.GenericJpaDAO;
import br.com.calleb.domain.jpa.ClienteJpa;

/**
 * Description of ClienteJpaDAO
 * Created by calle on 09/01/2024.
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}
