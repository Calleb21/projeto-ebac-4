package br.com.calleb.dao;

import br.com.calleb.dao.generic.jpa.GenericJpaDAO;
import br.com.calleb.dao.jpa.IVendaJpaDAO;
import br.com.calleb.domain.jpa.VendaJpa;
import br.com.calleb.exceptions.DAOException;
import br.com.calleb.exceptions.TipoChaveNaoEncontradaException;

/**
 * Description of VendaExclusaoJpaDAO
 * Created by calle on 09/01/2024.
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }
}
