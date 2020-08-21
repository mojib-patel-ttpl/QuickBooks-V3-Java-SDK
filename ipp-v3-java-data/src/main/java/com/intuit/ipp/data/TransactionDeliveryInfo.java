//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 05:00:20 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBO
 * 				Description: Transaction delivery info like DeliveryType, DeliveryTime, DeliveryErrorType (if any)
 * 			
 * 
 * <p>Java class for TransactionDeliveryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDeliveryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryType" type="{http://schema.intuit.com/finance/v3}DeliveryTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryErrorType" type="{http://schema.intuit.com/finance/v3}DeliveryErrorTypeEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDeliveryInfo", propOrder = {
    "deliveryType",
    "deliveryTime",
    "deliveryErrorType"
})
public class TransactionDeliveryInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DeliveryType")
    @XmlSchemaType(name = "string")
    protected DeliveryTypeEnum deliveryType;
    @XmlElement(name = "DeliveryTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date deliveryTime;
    @XmlElement(name = "DeliveryErrorType")
    @XmlSchemaType(name = "string")
    protected DeliveryErrorTypeEnum deliveryErrorType;

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTypeEnum }
     *     
     */
    public DeliveryTypeEnum getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTypeEnum }
     *     
     */
    public void setDeliveryType(DeliveryTypeEnum value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTime(Date value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the deliveryErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryErrorTypeEnum }
     *     
     */
    public DeliveryErrorTypeEnum getDeliveryErrorType() {
        return deliveryErrorType;
    }

    /**
     * Sets the value of the deliveryErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryErrorTypeEnum }
     *     
     */
    public void setDeliveryErrorType(DeliveryErrorTypeEnum value) {
        this.deliveryErrorType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransactionDeliveryInfo that = ((TransactionDeliveryInfo) object);
        {
            DeliveryTypeEnum lhsDeliveryType;
            lhsDeliveryType = this.getDeliveryType();
            DeliveryTypeEnum rhsDeliveryType;
            rhsDeliveryType = that.getDeliveryType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryType", lhsDeliveryType), LocatorUtils.property(thatLocator, "deliveryType", rhsDeliveryType), lhsDeliveryType, rhsDeliveryType, (this.deliveryType!= null), (that.deliveryType!= null))) {
                return false;
            }
        }
        {
            Date lhsDeliveryTime;
            lhsDeliveryTime = this.getDeliveryTime();
            Date rhsDeliveryTime;
            rhsDeliveryTime = that.getDeliveryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTime", lhsDeliveryTime), LocatorUtils.property(thatLocator, "deliveryTime", rhsDeliveryTime), lhsDeliveryTime, rhsDeliveryTime, (this.deliveryTime!= null), (that.deliveryTime!= null))) {
                return false;
            }
        }
        {
            DeliveryErrorTypeEnum lhsDeliveryErrorType;
            lhsDeliveryErrorType = this.getDeliveryErrorType();
            DeliveryErrorTypeEnum rhsDeliveryErrorType;
            rhsDeliveryErrorType = that.getDeliveryErrorType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryErrorType", lhsDeliveryErrorType), LocatorUtils.property(thatLocator, "deliveryErrorType", rhsDeliveryErrorType), lhsDeliveryErrorType, rhsDeliveryErrorType, (this.deliveryErrorType!= null), (that.deliveryErrorType!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            DeliveryTypeEnum theDeliveryType;
            theDeliveryType = this.getDeliveryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryType", theDeliveryType), currentHashCode, theDeliveryType, (this.deliveryType!= null));
        }
        {
            Date theDeliveryTime;
            theDeliveryTime = this.getDeliveryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTime", theDeliveryTime), currentHashCode, theDeliveryTime, (this.deliveryTime!= null));
        }
        {
            DeliveryErrorTypeEnum theDeliveryErrorType;
            theDeliveryErrorType = this.getDeliveryErrorType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryErrorType", theDeliveryErrorType), currentHashCode, theDeliveryErrorType, (this.deliveryErrorType!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
