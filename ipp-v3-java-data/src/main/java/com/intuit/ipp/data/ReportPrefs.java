//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 05:00:20 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
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
 * Defines Report Prefs details 
 * 
 * <p>Java class for ReportPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPrefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportBasis" type="{http://schema.intuit.com/finance/v3}ReportBasisEnum" minOccurs="0"/&gt;
 *         &lt;element name="CalcAgingReportFromTxnDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPrefs", propOrder = {
    "reportBasis",
    "calcAgingReportFromTxnDate"
})
public class ReportPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReportBasis")
    @XmlSchemaType(name = "string")
    protected ReportBasisEnum reportBasis;
    @XmlElement(name = "CalcAgingReportFromTxnDate")
    protected Boolean calcAgingReportFromTxnDate;

    /**
     * Gets the value of the reportBasis property.
     * 
     * @return
     *     possible object is
     *     {@link ReportBasisEnum }
     *     
     */
    public ReportBasisEnum getReportBasis() {
        return reportBasis;
    }

    /**
     * Sets the value of the reportBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportBasisEnum }
     *     
     */
    public void setReportBasis(ReportBasisEnum value) {
        this.reportBasis = value;
    }

    /**
     * Gets the value of the calcAgingReportFromTxnDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalcAgingReportFromTxnDate() {
        return calcAgingReportFromTxnDate;
    }

    /**
     * Sets the value of the calcAgingReportFromTxnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalcAgingReportFromTxnDate(Boolean value) {
        this.calcAgingReportFromTxnDate = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReportPrefs that = ((ReportPrefs) object);
        {
            ReportBasisEnum lhsReportBasis;
            lhsReportBasis = this.getReportBasis();
            ReportBasisEnum rhsReportBasis;
            rhsReportBasis = that.getReportBasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportBasis", lhsReportBasis), LocatorUtils.property(thatLocator, "reportBasis", rhsReportBasis), lhsReportBasis, rhsReportBasis, (this.reportBasis!= null), (that.reportBasis!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCalcAgingReportFromTxnDate;
            lhsCalcAgingReportFromTxnDate = this.isCalcAgingReportFromTxnDate();
            Boolean rhsCalcAgingReportFromTxnDate;
            rhsCalcAgingReportFromTxnDate = that.isCalcAgingReportFromTxnDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calcAgingReportFromTxnDate", lhsCalcAgingReportFromTxnDate), LocatorUtils.property(thatLocator, "calcAgingReportFromTxnDate", rhsCalcAgingReportFromTxnDate), lhsCalcAgingReportFromTxnDate, rhsCalcAgingReportFromTxnDate, (this.calcAgingReportFromTxnDate!= null), (that.calcAgingReportFromTxnDate!= null))) {
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
            ReportBasisEnum theReportBasis;
            theReportBasis = this.getReportBasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportBasis", theReportBasis), currentHashCode, theReportBasis, (this.reportBasis!= null));
        }
        {
            Boolean theCalcAgingReportFromTxnDate;
            theCalcAgingReportFromTxnDate = this.isCalcAgingReportFromTxnDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calcAgingReportFromTxnDate", theCalcAgingReportFromTxnDate), currentHashCode, theCalcAgingReportFromTxnDate, (this.calcAgingReportFromTxnDate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
