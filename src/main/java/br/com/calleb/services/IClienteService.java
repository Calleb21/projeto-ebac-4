package br.com.calleb.services;

import br.com.calleb.domain.Cliente;
import br.com.calleb.exceptions.DAOException;

/**
 * Description of IClienteService
 * Created by calle on 09/01/2024.
 */
public interface IClienteService {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
