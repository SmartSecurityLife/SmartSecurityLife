//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.28 at 02:26:13 PM EST 
//


package org.jboss.seam.security.external.jaxb.samlv2.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthnQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthnQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}SubjectQueryAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequestedAuthnContext" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SessionIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnQueryType", propOrder = {
    "requestedAuthnContext"
})
public class AuthnQueryType
    extends SubjectQueryAbstractType
{

    @XmlElement(name = "RequestedAuthnContext")
    protected RequestedAuthnContextType requestedAuthnContext;
    @XmlAttribute(name = "SessionIndex")
    protected String sessionIndex;

    /**
     * Gets the value of the requestedAuthnContext property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAuthnContextType }
     *     
     */
    public RequestedAuthnContextType getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    /**
     * Sets the value of the requestedAuthnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAuthnContextType }
     *     
     */
    public void setRequestedAuthnContext(RequestedAuthnContextType value) {
        this.requestedAuthnContext = value;
    }

    /**
     * Gets the value of the sessionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionIndex() {
        return sessionIndex;
    }

    /**
     * Sets the value of the sessionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionIndex(String value) {
        this.sessionIndex = value;
    }

}