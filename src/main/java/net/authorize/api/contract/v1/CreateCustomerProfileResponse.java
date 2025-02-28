//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="customerProfileId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *         &lt;element name="customerPaymentProfileIdList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfNumericString"/>
 *         &lt;element name="customerShippingAddressIdList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfNumericString"/>
 *         &lt;element name="validationDirectResponseList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerProfileId",
    "customerPaymentProfileIdList",
    "customerShippingAddressIdList",
    "validationDirectResponseList"
})
@XmlRootElement(name = "createCustomerProfileResponse")
public class CreateCustomerProfileResponse
    extends ANetApiResponse
{

    protected String customerProfileId;
    @XmlElement(required = true)
    protected ArrayOfNumericString customerPaymentProfileIdList;
    @XmlElement(required = true)
    protected ArrayOfNumericString customerShippingAddressIdList;
    @XmlElement(required = true)
    protected ArrayOfString validationDirectResponseList;

    /**
     * Gets the value of the customerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the customerPaymentProfileIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public ArrayOfNumericString getCustomerPaymentProfileIdList() {
        return customerPaymentProfileIdList;
    }

    /**
     * Sets the value of the customerPaymentProfileIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public void setCustomerPaymentProfileIdList(ArrayOfNumericString value) {
        this.customerPaymentProfileIdList = value;
    }

    /**
     * Gets the value of the customerShippingAddressIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public ArrayOfNumericString getCustomerShippingAddressIdList() {
        return customerShippingAddressIdList;
    }

    /**
     * Sets the value of the customerShippingAddressIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public void setCustomerShippingAddressIdList(ArrayOfNumericString value) {
        this.customerShippingAddressIdList = value;
    }

    /**
     * Gets the value of the validationDirectResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getValidationDirectResponseList() {
        return validationDirectResponseList;
    }

    /**
     * Sets the value of the validationDirectResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setValidationDirectResponseList(ArrayOfString value) {
        this.validationDirectResponseList = value;
    }

}
