/*
*   Livre Programação ltda-ME
*
*   Criando um Web Services SOAP com JAX-WS.
*
 */
package org.mano.produto.boundary;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import org.mano.produto.control.ejb.ProductEJB;
import org.mano.produto.entity.Product;

@WebService
public class ProductWS {

    @EJB
    ProductEJB productEJB;

    public List<Product> getAllProductDetails() {
        return productEJB.getAllProducts();
    }

    public List<String> getAllProductNames() {
        List<Product> list = productEJB.getAllProducts();
        List<String> productNames = new ArrayList<>();
        for (Product p : list) {
            productNames.add(p.getName());
        }
        return productNames;
    }
}
