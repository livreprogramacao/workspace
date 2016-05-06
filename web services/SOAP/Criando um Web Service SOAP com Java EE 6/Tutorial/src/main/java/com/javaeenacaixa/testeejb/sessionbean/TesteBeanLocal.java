package com.javaeenacaixa.testeejb.sessionbean;

import java.io.Serializable;
import javax.ejb.Local;

/**
 * Interface local para os metodos de nogocio de teste
 *
 * @author eliomarcolino
 */
@Local
public interface TesteBeanLocal extends Serializable {

    /**
     * Declaracao do metodo de negocio de testes
     *
     * @param str - String que sera processada
     * @return String resultado do processamento
     */
    public String efetuarOperacaoDeNegocio(final String str);
}
