package br.com.calleb.services.generic.jpa;

import br.com.calleb.dao.Persistente;
import br.com.calleb.dao.generic.jpa.IGenericJapDAO;
import br.com.calleb.exceptions.DAOException;
import br.com.calleb.exceptions.MaisDeUmRegistroException;
import br.com.calleb.exceptions.TableException;
import br.com.calleb.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

/**
 * Description of GenericJpaService
 * Created by calle on 09/01/2024.
 */
public abstract class GenericJpaService<T extends Persistente, E extends Serializable>
        implements IGenericJpaService<T, E> {

    protected IGenericJapDAO<T, E> dao;

    public GenericJpaService(IGenericJapDAO<T, E> dao) {
        this.dao = dao;
    }


    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }
}
