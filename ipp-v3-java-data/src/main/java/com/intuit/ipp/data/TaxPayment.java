//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
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
 * 				Description: Tax Payment/Refund made against filed taxReturn.
 * 			
 * 
 * <p>Java class for TaxPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Refund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPayment", propOrder = {
    "paymentDate",
    "paymentAccountRef",
    "paymentAmount",
    "description",
    "refund"
})
public class TaxPayment
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PaymentDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date paymentDate;
    @XmlElement(name = "PaymentAccountRef")
    protected ReferenceType paymentAccountRef;
    @XmlElement(name = "PaymentAmount")
    protected BigDecimal paymentAmount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Refund")
    protected Boolean refund;

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(Date value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPaymentAccountRef() {
        return paymentAccountRef;
    }

    /**
     * Sets the value of the paymentAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPaymentAccountRef(ReferenceType value) {
        this.paymentAccountRef = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefund(Boolean value) {
        this.refund = value;
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
        final TaxPayment that = ((TaxPayment) object);
        {
            Date lhsPaymentDate;
            lhsPaymentDate = this.getPaymentDate();
            Date rhsPaymentDate;
            rhsPaymentDate = that.getPaymentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentDate", lhsPaymentDate), LocatorUtils.property(thatLocator, "paymentDate", rhsPaymentDate), lhsPaymentDate, rhsPaymentDate, (this.paymentDate!= null), (that.paymentDate!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsPaymentAccountRef;
            lhsPaymentAccountRef = this.getPaymentAccountRef();
            ReferenceType rhsPaymentAccountRef;
            rhsPaymentAccountRef = that.getPaymentAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentAccountRef", lhsPaymentAccountRef), LocatorUtils.property(thatLocator, "paymentAccountRef", rhsPaymentAccountRef), lhsPaymentAccountRef, rhsPaymentAccountRef, (this.paymentAccountRef!= null), (that.paymentAccountRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPaymentAmount;
            lhsPaymentAmount = this.getPaymentAmount();
            BigDecimal rhsPaymentAmount;
            rhsPaymentAmount = that.getPaymentAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentAmount", lhsPaymentAmount), LocatorUtils.property(thatLocator, "paymentAmount", rhsPaymentAmount), lhsPaymentAmount, rhsPaymentAmount, (this.paymentAmount!= null), (that.paymentAmount!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRefund;
            lhsRefund = this.isRefund();
            Boolean rhsRefund;
            rhsRefund = that.isRefund();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refund", lhsRefund), LocatorUtils.property(thatLocator, "refund", rhsRefund), lhsRefund, rhsRefund, (this.refund!= null), (that.refund!= null))) {
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
            Date thePaymentDate;
            thePaymentDate = this.getPaymentDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentDate", thePaymentDate), currentHashCode, thePaymentDate, (this.paymentDate!= null));
        }
        {
            ReferenceType thePaymentAccountRef;
            thePaymentAccountRef = this.getPaymentAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentAccountRef", thePaymentAccountRef), currentHashCode, thePaymentAccountRef, (this.paymentAccountRef!= null));
        }
        {
            BigDecimal thePaymentAmount;
            thePaymentAmount = this.getPaymentAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentAmount", thePaymentAmount), currentHashCode, thePaymentAmount, (this.paymentAmount!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            Boolean theRefund;
            theRefund = this.isRefund();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refund", theRefund), currentHashCode, theRefund, (this.refund!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
