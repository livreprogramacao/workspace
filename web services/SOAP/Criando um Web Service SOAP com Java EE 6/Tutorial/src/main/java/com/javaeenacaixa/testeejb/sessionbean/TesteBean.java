package com.javaeenacaixa.testeejb.sessionbean;

import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 * Implementacao dos metodos locais de negocio de teste como um EJB Stateless
 *
 * @author eliomarcolino
 */
@Stateless(name = "TesteBean", mappedName = "com.javaeenacaixa.testeejb.sessionbean.TesteBean")
public class TesteBean implements TesteBeanLocal {

    Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * Implementacao do metodo de negocio de testes
     *
     * Para fins didaticos, este metodo e responsavel por inverter o argumento
     * String recebido
     */
    @Override
    public String efetuarOperacaoDeNegocio(final String str) {
        logger.info("Operacao de negocio requisitada para: " + str);

        String resultado = null;
        if (str != null && !str.isEmpty()) {
            StringBuilder stringInvertida = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                stringInvertida.append(str.charAt(i));
            }
            resultado = stringInvertida.toString();
        }

        logger.info("Resultado da operacao de negocio: " + resultado);
        return resultado;
    }
}
