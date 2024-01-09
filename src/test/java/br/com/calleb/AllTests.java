package br.com.calleb;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Description of AllTests
 * Created by calle on 09/01/2024.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
