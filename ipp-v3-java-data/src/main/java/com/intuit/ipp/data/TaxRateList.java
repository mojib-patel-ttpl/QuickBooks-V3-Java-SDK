//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 05:00:20 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for TaxRateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRateList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRateDetail" type="{http://schema.intuit.com/finance/v3}TaxRateDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="originatingGroupId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRateList", propOrder = {
    "taxRateDetail"
})
public class TaxRateList implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxRateDetail")
    protected List<TaxRateDetail> taxRateDetail;
    @XmlAttribute(name = "originatingGroupId")
    protected String originatingGroupId;

    /**
     * Gets the value of the taxRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRateDetail }
     * 
     * 
     */
    public List<TaxRateDetail> getTaxRateDetail() {
        if (taxRateDetail == null) {
            taxRateDetail = new ArrayList<TaxRateDetail>();
        }
        return this.taxRateDetail;
    }

    /**
     * Gets the value of the originatingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingGroupId() {
        return originatingGroupId;
    }

    /**
     * Sets the value of the originatingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingGroupId(String value) {
        this.originatingGroupId = value;
    }

    /**
     * Sets the value of the taxRateDetail property.
     * 
     * @param taxRateDetail
     *     allowed object is
     *     {@link TaxRateDetail }
     *     
     */
    public void setTaxRateDetail(List<TaxRateDetail> taxRateDetail) {
        this.taxRateDetail = taxRateDetail;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxRateList that = ((TaxRateList) object);
        {
            List<TaxRateDetail> lhsTaxRateDetail;
            lhsTaxRateDetail = (((this.taxRateDetail!= null)&&(!this.taxRateDetail.isEmpty()))?this.getTaxRateDetail():null);
            List<TaxRateDetail> rhsTaxRateDetail;
            rhsTaxRateDetail = (((that.taxRateDetail!= null)&&(!that.taxRateDetail.isEmpty()))?that.getTaxRateDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateDetail", lhsTaxRateDetail), LocatorUtils.property(thatLocator, "taxRateDetail", rhsTaxRateDetail), lhsTaxRateDetail, rhsTaxRateDetail, ((this.taxRateDetail!= null)&&(!this.taxRateDetail.isEmpty())), ((that.taxRateDetail!= null)&&(!that.taxRateDetail.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsOriginatingGroupId;
            lhsOriginatingGroupId = this.getOriginatingGroupId();
            String rhsOriginatingGroupId;
            rhsOriginatingGroupId = that.getOriginatingGroupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originatingGroupId", lhsOriginatingGroupId), LocatorUtils.property(thatLocator, "originatingGroupId", rhsOriginatingGroupId), lhsOriginatingGroupId, rhsOriginatingGroupId, (this.originatingGroupId!= null), (that.originatingGroupId!= null))) {
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
            List<TaxRateDetail> theTaxRateDetail;
            theTaxRateDetail = (((this.taxRateDetail!= null)&&(!this.taxRateDetail.isEmpty()))?this.getTaxRateDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateDetail", theTaxRateDetail), currentHashCode, theTaxRateDetail, ((this.taxRateDetail!= null)&&(!this.taxRateDetail.isEmpty())));
        }
        {
            String theOriginatingGroupId;
            theOriginatingGroupId = this.getOriginatingGroupId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originatingGroupId", theOriginatingGroupId), currentHashCode, theOriginatingGroupId, (this.originatingGroupId!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
