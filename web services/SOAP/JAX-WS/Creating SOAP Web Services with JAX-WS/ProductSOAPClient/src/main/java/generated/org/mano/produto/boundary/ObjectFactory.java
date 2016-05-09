
package org.mano.produto.boundary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mano.produto.boundary package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllProductNames_QNAME = new QName("http://boundary.produto.mano.org/", "getAllProductNames");
    private final static QName _GetAllProductDetails_QNAME = new QName("http://boundary.produto.mano.org/", "getAllProductDetails");
    private final static QName _GetAllProductDetailsResponse_QNAME = new QName("http://boundary.produto.mano.org/", "getAllProductDetailsResponse");
    private final static QName _GetAllProductNamesResponse_QNAME = new QName("http://boundary.produto.mano.org/", "getAllProductNamesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mano.produto.boundary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProductDetailsResponse }
     * 
     */
    public GetAllProductDetailsResponse createGetAllProductDetailsResponse() {
        return new GetAllProductDetailsResponse();
    }

    /**
     * Create an instance of {@link GetAllProductNamesResponse }
     * 
     */
    public GetAllProductNamesResponse createGetAllProductNamesResponse() {
        return new GetAllProductNamesResponse();
    }

    /**
     * Create an instance of {@link GetAllProductDetails }
     * 
     */
    public GetAllProductDetails createGetAllProductDetails() {
        return new GetAllProductDetails();
    }

    /**
     * Create an instance of {@link GetAllProductNames }
     * 
     */
    public GetAllProductNames createGetAllProductNames() {
        return new GetAllProductNames();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.produto.mano.org/", name = "getAllProductNames")
    public JAXBElement<GetAllProductNames> createGetAllProductNames(GetAllProductNames value) {
        return new JAXBElement<GetAllProductNames>(_GetAllProductNames_QNAME, GetAllProductNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.produto.mano.org/", name = "getAllProductDetails")
    public JAXBElement<GetAllProductDetails> createGetAllProductDetails(GetAllProductDetails value) {
        return new JAXBElement<GetAllProductDetails>(_GetAllProductDetails_QNAME, GetAllProductDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.produto.mano.org/", name = "getAllProductDetailsResponse")
    public JAXBElement<GetAllProductDetailsResponse> createGetAllProductDetailsResponse(GetAllProductDetailsResponse value) {
        return new JAXBElement<GetAllProductDetailsResponse>(_GetAllProductDetailsResponse_QNAME, GetAllProductDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.produto.mano.org/", name = "getAllProductNamesResponse")
    public JAXBElement<GetAllProductNamesResponse> createGetAllProductNamesResponse(GetAllProductNamesResponse value) {
        return new JAXBElement<GetAllProductNamesResponse>(_GetAllProductNamesResponse_QNAME, GetAllProductNamesResponse.class, null, value);
    }

}
