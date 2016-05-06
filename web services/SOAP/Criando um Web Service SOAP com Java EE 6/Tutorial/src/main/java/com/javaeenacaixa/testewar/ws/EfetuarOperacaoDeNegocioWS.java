
package com.javaeenacaixa.testewar.ws;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaeenacaixa.testeejb.sessionbean.TesteBeanLocal;
import com.javaeenacaixa.testewar.ws.types.EfetuarOperacaoDeNegocioRequest;
import com.javaeenacaixa.testewar.ws.types.EfetuarOperacaoDeNegocioResponse;
import com.javaeenacaixa.testewar.ws.types.ObjectFactory;

@WebService(name="EfetuarOperacaoDeNegocioWS",serviceName="EfetuarOperacaoDeNegocioWSService")
public class EfetuarOperacaoDeNegocioWS {
    
    //Injecao do EJB da camada de negocio
    @EJB
    private TesteBeanLocal testeBean;

    @WebMethod(action="process")
    public EfetuarOperacaoDeNegocioResponse efetuarOperacaoDeNegocio(@WebParam(name="request") EfetuarOperacaoDeNegocioRequest request){
        
        //Instanciacao do objeto de retorno
        ObjectFactory factory = new ObjectFactory();
        EfetuarOperacaoDeNegocioResponse response = factory.createEfetuarOperacaoDeNegocioResponse();
        
        //Chamada ao metodo de negocio
        response.setResultado(                 
            testeBean.efetuarOperacaoDeNegocio(request.getTexto())
        );
        
        return response;
    }    
}
