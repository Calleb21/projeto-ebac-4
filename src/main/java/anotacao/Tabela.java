package anotacao;

import java.lang.annotation.*;

/**
 * Description of Tabela
 * Created by calle on 09/01/2024.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {

    String value();
}
