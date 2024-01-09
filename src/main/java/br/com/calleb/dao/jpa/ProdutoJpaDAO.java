package br.com.calleb.dao.jpa;

import br.com.calleb.dao.generic.jpa.GenericJpaDAO;
import br.com.calleb.domain.jpa.ProdutoJpa;

/**
 * Description of ProdutoJpaDAO
 * Created by calle on 09/01/2024.
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }
}
