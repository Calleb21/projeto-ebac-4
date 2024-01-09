package br.com.calleb.services;

import br.com.calleb.dao.IProdutoDAO;
import br.com.calleb.domain.Produto;
import br.com.calleb.services.generic.GenericService;

/**
 * Description of ProdutoService
 * Created by calle on 09/01/2024.
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}