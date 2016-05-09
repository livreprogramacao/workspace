/*
*   Livre Programação ltda-ME
*
*   Criando um Web Services SOAP com JAX-WS.
*
 */
package org.mano.produto.control.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.mano.produto.entity.Product;

@Stateless
public class ProductEJB {

    @PersistenceContext(unitName = "ProductSOAPServer")
    private EntityManager entityManager;

    public List<Product> getAllProducts() {
        TypedQuery<Product> query = entityManager.createNamedQuery("Product.getAllProducts", Product.class);
        return query.getResultList();
    }
}
