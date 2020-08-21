//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 05:00:20 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 * 				Description: Internal use only: Convenience Fee detail for the invoice
 * 			
 * 
 * <p>Java class for ConvenienceFeeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvenienceFeeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConvenienceFeeType" type="{http://schema.intuit.com/finance/v3}ConvenienceFeeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceFeePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvenienceFeeDetail", propOrder = {
    "convenienceFeeType",
    "convenienceFeePercent"
})
public class ConvenienceFeeDetail
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConvenienceFeeType")
    @XmlSchemaType(name = "string")
    protected ConvenienceFeeTypeEnum convenienceFeeType;
    @XmlElement(name = "ConvenienceFeePercent")
    protected BigDecimal convenienceFeePercent;

    /**
     * Gets the value of the convenienceFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link ConvenienceFeeTypeEnum }
     *     
     */
    public ConvenienceFeeTypeEnum getConvenienceFeeType() {
        return convenienceFeeType;
    }

    /**
     * Sets the value of the convenienceFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvenienceFeeTypeEnum }
     *     
     */
    public void setConvenienceFeeType(ConvenienceFeeTypeEnum value) {
        this.convenienceFeeType = value;
    }

    /**
     * Gets the value of the convenienceFeePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConvenienceFeePercent() {
        return convenienceFeePercent;
    }

    /**
     * Sets the value of the convenienceFeePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConvenienceFeePercent(BigDecimal value) {
        this.convenienceFeePercent = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConvenienceFeeDetail that = ((ConvenienceFeeDetail) object);
        {
            ConvenienceFeeTypeEnum lhsConvenienceFeeType;
            lhsConvenienceFeeType = this.getConvenienceFeeType();
            ConvenienceFeeTypeEnum rhsConvenienceFeeType;
            rhsConvenienceFeeType = that.getConvenienceFeeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convenienceFeeType", lhsConvenienceFeeType), LocatorUtils.property(thatLocator, "convenienceFeeType", rhsConvenienceFeeType), lhsConvenienceFeeType, rhsConvenienceFeeType, (this.convenienceFeeType!= null), (that.convenienceFeeType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsConvenienceFeePercent;
            lhsConvenienceFeePercent = this.getConvenienceFeePercent();
            BigDecimal rhsConvenienceFeePercent;
            rhsConvenienceFeePercent = that.getConvenienceFeePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convenienceFeePercent", lhsConvenienceFeePercent), LocatorUtils.property(thatLocator, "convenienceFeePercent", rhsConvenienceFeePercent), lhsConvenienceFeePercent, rhsConvenienceFeePercent, (this.convenienceFeePercent!= null), (that.convenienceFeePercent!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ConvenienceFeeTypeEnum theConvenienceFeeType;
            theConvenienceFeeType = this.getConvenienceFeeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convenienceFeeType", theConvenienceFeeType), currentHashCode, theConvenienceFeeType, (this.convenienceFeeType!= null));
        }
        {
            BigDecimal theConvenienceFeePercent;
            theConvenienceFeePercent = this.getConvenienceFeePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convenienceFeePercent", theConvenienceFeePercent), currentHashCode, theConvenienceFeePercent, (this.convenienceFeePercent!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
