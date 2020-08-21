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
 * 				Product: ALL
 * 				Description: Represents a tax agency to whom sales/purchase/VAT taxes collected are paid
 * 			
 * 
 * <p>Java class for TaxAgency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAgency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Vendor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SalesTaxCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesTaxReturnRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportingPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxTrackedOnPurchases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxOnPurchasesAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxTrackedOnSales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxTrackedOnSalesAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxOnTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastFileDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TaxAgencyExt" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAgencyConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAgency", propOrder = {
    "salesTaxCodeRef",
    "salesTaxCountry",
    "salesTaxReturnRef",
    "taxRegistrationNumber",
    "reportingPeriod",
    "taxTrackedOnPurchases",
    "taxOnPurchasesAccountRef",
    "taxTrackedOnSales",
    "taxTrackedOnSalesAccountRef",
    "taxOnTax",
    "lastFileDate",
    "taxAgencyExt",
    "taxAgencyConfig"
})
public class TaxAgency
    extends Vendor
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SalesTaxCodeRef")
    protected ReferenceType salesTaxCodeRef;
    @XmlElement(name = "SalesTaxCountry")
    protected String salesTaxCountry;
    @XmlElement(name = "SalesTaxReturnRef")
    protected ReferenceType salesTaxReturnRef;
    @XmlElement(name = "TaxRegistrationNumber")
    protected String taxRegistrationNumber;
    @XmlElement(name = "ReportingPeriod")
    protected String reportingPeriod;
    @XmlElement(name = "TaxTrackedOnPurchases")
    protected Boolean taxTrackedOnPurchases;
    @XmlElement(name = "TaxOnPurchasesAccountRef")
    protected ReferenceType taxOnPurchasesAccountRef;
    @XmlElement(name = "TaxTrackedOnSales")
    protected Boolean taxTrackedOnSales;
    @XmlElement(name = "TaxTrackedOnSalesAccountRef")
    protected ReferenceType taxTrackedOnSalesAccountRef;
    @XmlElement(name = "TaxOnTax")
    protected Boolean taxOnTax;
    @XmlElement(name = "LastFileDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date lastFileDate;
    @XmlElement(name = "TaxAgencyExt")
    protected IntuitAnyType taxAgencyExt;
    @XmlElement(name = "TaxAgencyConfig")
    protected String taxAgencyConfig;

    /**
     * Gets the value of the salesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSalesTaxCodeRef() {
        return salesTaxCodeRef;
    }

    /**
     * Sets the value of the salesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSalesTaxCodeRef(ReferenceType value) {
        this.salesTaxCodeRef = value;
    }

    /**
     * Gets the value of the salesTaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxCountry() {
        return salesTaxCountry;
    }

    /**
     * Sets the value of the salesTaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxCountry(String value) {
        this.salesTaxCountry = value;
    }

    /**
     * Gets the value of the salesTaxReturnRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSalesTaxReturnRef() {
        return salesTaxReturnRef;
    }

    /**
     * Sets the value of the salesTaxReturnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSalesTaxReturnRef(ReferenceType value) {
        this.salesTaxReturnRef = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNumber(String value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the reportingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingPeriod(String value) {
        this.reportingPeriod = value;
    }

    /**
     * Gets the value of the taxTrackedOnPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxTrackedOnPurchases() {
        return taxTrackedOnPurchases;
    }

    /**
     * Sets the value of the taxTrackedOnPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxTrackedOnPurchases(Boolean value) {
        this.taxTrackedOnPurchases = value;
    }

    /**
     * Gets the value of the taxOnPurchasesAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxOnPurchasesAccountRef() {
        return taxOnPurchasesAccountRef;
    }

    /**
     * Sets the value of the taxOnPurchasesAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxOnPurchasesAccountRef(ReferenceType value) {
        this.taxOnPurchasesAccountRef = value;
    }

    /**
     * Gets the value of the taxTrackedOnSales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxTrackedOnSales() {
        return taxTrackedOnSales;
    }

    /**
     * Sets the value of the taxTrackedOnSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxTrackedOnSales(Boolean value) {
        this.taxTrackedOnSales = value;
    }

    /**
     * Gets the value of the taxTrackedOnSalesAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxTrackedOnSalesAccountRef() {
        return taxTrackedOnSalesAccountRef;
    }

    /**
     * Sets the value of the taxTrackedOnSalesAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxTrackedOnSalesAccountRef(ReferenceType value) {
        this.taxTrackedOnSalesAccountRef = value;
    }

    /**
     * Gets the value of the taxOnTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnTax() {
        return taxOnTax;
    }

    /**
     * Sets the value of the taxOnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxOnTax(Boolean value) {
        this.taxOnTax = value;
    }

    /**
     * Gets the value of the lastFileDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastFileDate() {
        return lastFileDate;
    }

    /**
     * Sets the value of the lastFileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFileDate(Date value) {
        this.lastFileDate = value;
    }

    /**
     * Gets the value of the taxAgencyExt property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTaxAgencyExt() {
        return taxAgencyExt;
    }

    /**
     * Sets the value of the taxAgencyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTaxAgencyExt(IntuitAnyType value) {
        this.taxAgencyExt = value;
    }

    /**
     * Gets the value of the taxAgencyConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAgencyConfig() {
        return taxAgencyConfig;
    }

    /**
     * Sets the value of the taxAgencyConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAgencyConfig(String value) {
        this.taxAgencyConfig = value;
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
        final TaxAgency that = ((TaxAgency) object);
        {
            ReferenceType lhsSalesTaxCodeRef;
            lhsSalesTaxCodeRef = this.getSalesTaxCodeRef();
            ReferenceType rhsSalesTaxCodeRef;
            rhsSalesTaxCodeRef = that.getSalesTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTaxCodeRef", lhsSalesTaxCodeRef), LocatorUtils.property(thatLocator, "salesTaxCodeRef", rhsSalesTaxCodeRef), lhsSalesTaxCodeRef, rhsSalesTaxCodeRef, (this.salesTaxCodeRef!= null), (that.salesTaxCodeRef!= null))) {
                return false;
            }
        }
        {
            String lhsSalesTaxCountry;
            lhsSalesTaxCountry = this.getSalesTaxCountry();
            String rhsSalesTaxCountry;
            rhsSalesTaxCountry = that.getSalesTaxCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTaxCountry", lhsSalesTaxCountry), LocatorUtils.property(thatLocator, "salesTaxCountry", rhsSalesTaxCountry), lhsSalesTaxCountry, rhsSalesTaxCountry, (this.salesTaxCountry!= null), (that.salesTaxCountry!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsSalesTaxReturnRef;
            lhsSalesTaxReturnRef = this.getSalesTaxReturnRef();
            ReferenceType rhsSalesTaxReturnRef;
            rhsSalesTaxReturnRef = that.getSalesTaxReturnRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTaxReturnRef", lhsSalesTaxReturnRef), LocatorUtils.property(thatLocator, "salesTaxReturnRef", rhsSalesTaxReturnRef), lhsSalesTaxReturnRef, rhsSalesTaxReturnRef, (this.salesTaxReturnRef!= null), (that.salesTaxReturnRef!= null))) {
                return false;
            }
        }
        {
            String lhsTaxRegistrationNumber;
            lhsTaxRegistrationNumber = this.getTaxRegistrationNumber();
            String rhsTaxRegistrationNumber;
            rhsTaxRegistrationNumber = that.getTaxRegistrationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRegistrationNumber", lhsTaxRegistrationNumber), LocatorUtils.property(thatLocator, "taxRegistrationNumber", rhsTaxRegistrationNumber), lhsTaxRegistrationNumber, rhsTaxRegistrationNumber, (this.taxRegistrationNumber!= null), (that.taxRegistrationNumber!= null))) {
                return false;
            }
        }
        {
            String lhsReportingPeriod;
            lhsReportingPeriod = this.getReportingPeriod();
            String rhsReportingPeriod;
            rhsReportingPeriod = that.getReportingPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportingPeriod", lhsReportingPeriod), LocatorUtils.property(thatLocator, "reportingPeriod", rhsReportingPeriod), lhsReportingPeriod, rhsReportingPeriod, (this.reportingPeriod!= null), (that.reportingPeriod!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTaxTrackedOnPurchases;
            lhsTaxTrackedOnPurchases = this.isTaxTrackedOnPurchases();
            Boolean rhsTaxTrackedOnPurchases;
            rhsTaxTrackedOnPurchases = that.isTaxTrackedOnPurchases();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTrackedOnPurchases", lhsTaxTrackedOnPurchases), LocatorUtils.property(thatLocator, "taxTrackedOnPurchases", rhsTaxTrackedOnPurchases), lhsTaxTrackedOnPurchases, rhsTaxTrackedOnPurchases, (this.taxTrackedOnPurchases!= null), (that.taxTrackedOnPurchases!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxOnPurchasesAccountRef;
            lhsTaxOnPurchasesAccountRef = this.getTaxOnPurchasesAccountRef();
            ReferenceType rhsTaxOnPurchasesAccountRef;
            rhsTaxOnPurchasesAccountRef = that.getTaxOnPurchasesAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxOnPurchasesAccountRef", lhsTaxOnPurchasesAccountRef), LocatorUtils.property(thatLocator, "taxOnPurchasesAccountRef", rhsTaxOnPurchasesAccountRef), lhsTaxOnPurchasesAccountRef, rhsTaxOnPurchasesAccountRef, (this.taxOnPurchasesAccountRef!= null), (that.taxOnPurchasesAccountRef!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTaxTrackedOnSales;
            lhsTaxTrackedOnSales = this.isTaxTrackedOnSales();
            Boolean rhsTaxTrackedOnSales;
            rhsTaxTrackedOnSales = that.isTaxTrackedOnSales();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTrackedOnSales", lhsTaxTrackedOnSales), LocatorUtils.property(thatLocator, "taxTrackedOnSales", rhsTaxTrackedOnSales), lhsTaxTrackedOnSales, rhsTaxTrackedOnSales, (this.taxTrackedOnSales!= null), (that.taxTrackedOnSales!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxTrackedOnSalesAccountRef;
            lhsTaxTrackedOnSalesAccountRef = this.getTaxTrackedOnSalesAccountRef();
            ReferenceType rhsTaxTrackedOnSalesAccountRef;
            rhsTaxTrackedOnSalesAccountRef = that.getTaxTrackedOnSalesAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTrackedOnSalesAccountRef", lhsTaxTrackedOnSalesAccountRef), LocatorUtils.property(thatLocator, "taxTrackedOnSalesAccountRef", rhsTaxTrackedOnSalesAccountRef), lhsTaxTrackedOnSalesAccountRef, rhsTaxTrackedOnSalesAccountRef, (this.taxTrackedOnSalesAccountRef!= null), (that.taxTrackedOnSalesAccountRef!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTaxOnTax;
            lhsTaxOnTax = this.isTaxOnTax();
            Boolean rhsTaxOnTax;
            rhsTaxOnTax = that.isTaxOnTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxOnTax", lhsTaxOnTax), LocatorUtils.property(thatLocator, "taxOnTax", rhsTaxOnTax), lhsTaxOnTax, rhsTaxOnTax, (this.taxOnTax!= null), (that.taxOnTax!= null))) {
                return false;
            }
        }
        {
            Date lhsLastFileDate;
            lhsLastFileDate = this.getLastFileDate();
            Date rhsLastFileDate;
            rhsLastFileDate = that.getLastFileDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastFileDate", lhsLastFileDate), LocatorUtils.property(thatLocator, "lastFileDate", rhsLastFileDate), lhsLastFileDate, rhsLastFileDate, (this.lastFileDate!= null), (that.lastFileDate!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTaxAgencyExt;
            lhsTaxAgencyExt = this.getTaxAgencyExt();
            IntuitAnyType rhsTaxAgencyExt;
            rhsTaxAgencyExt = that.getTaxAgencyExt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAgencyExt", lhsTaxAgencyExt), LocatorUtils.property(thatLocator, "taxAgencyExt", rhsTaxAgencyExt), lhsTaxAgencyExt, rhsTaxAgencyExt, (this.taxAgencyExt!= null), (that.taxAgencyExt!= null))) {
                return false;
            }
        }
        {
            String lhsTaxAgencyConfig;
            lhsTaxAgencyConfig = this.getTaxAgencyConfig();
            String rhsTaxAgencyConfig;
            rhsTaxAgencyConfig = that.getTaxAgencyConfig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAgencyConfig", lhsTaxAgencyConfig), LocatorUtils.property(thatLocator, "taxAgencyConfig", rhsTaxAgencyConfig), lhsTaxAgencyConfig, rhsTaxAgencyConfig, (this.taxAgencyConfig!= null), (that.taxAgencyConfig!= null))) {
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
            ReferenceType theSalesTaxCodeRef;
            theSalesTaxCodeRef = this.getSalesTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTaxCodeRef", theSalesTaxCodeRef), currentHashCode, theSalesTaxCodeRef, (this.salesTaxCodeRef!= null));
        }
        {
            String theSalesTaxCountry;
            theSalesTaxCountry = this.getSalesTaxCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTaxCountry", theSalesTaxCountry), currentHashCode, theSalesTaxCountry, (this.salesTaxCountry!= null));
        }
        {
            ReferenceType theSalesTaxReturnRef;
            theSalesTaxReturnRef = this.getSalesTaxReturnRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTaxReturnRef", theSalesTaxReturnRef), currentHashCode, theSalesTaxReturnRef, (this.salesTaxReturnRef!= null));
        }
        {
            String theTaxRegistrationNumber;
            theTaxRegistrationNumber = this.getTaxRegistrationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRegistrationNumber", theTaxRegistrationNumber), currentHashCode, theTaxRegistrationNumber, (this.taxRegistrationNumber!= null));
        }
        {
            String theReportingPeriod;
            theReportingPeriod = this.getReportingPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportingPeriod", theReportingPeriod), currentHashCode, theReportingPeriod, (this.reportingPeriod!= null));
        }
        {
            Boolean theTaxTrackedOnPurchases;
            theTaxTrackedOnPurchases = this.isTaxTrackedOnPurchases();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTrackedOnPurchases", theTaxTrackedOnPurchases), currentHashCode, theTaxTrackedOnPurchases, (this.taxTrackedOnPurchases!= null));
        }
        {
            ReferenceType theTaxOnPurchasesAccountRef;
            theTaxOnPurchasesAccountRef = this.getTaxOnPurchasesAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxOnPurchasesAccountRef", theTaxOnPurchasesAccountRef), currentHashCode, theTaxOnPurchasesAccountRef, (this.taxOnPurchasesAccountRef!= null));
        }
        {
            Boolean theTaxTrackedOnSales;
            theTaxTrackedOnSales = this.isTaxTrackedOnSales();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTrackedOnSales", theTaxTrackedOnSales), currentHashCode, theTaxTrackedOnSales, (this.taxTrackedOnSales!= null));
        }
        {
            ReferenceType theTaxTrackedOnSalesAccountRef;
            theTaxTrackedOnSalesAccountRef = this.getTaxTrackedOnSalesAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTrackedOnSalesAccountRef", theTaxTrackedOnSalesAccountRef), currentHashCode, theTaxTrackedOnSalesAccountRef, (this.taxTrackedOnSalesAccountRef!= null));
        }
        {
            Boolean theTaxOnTax;
            theTaxOnTax = this.isTaxOnTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxOnTax", theTaxOnTax), currentHashCode, theTaxOnTax, (this.taxOnTax!= null));
        }
        {
            Date theLastFileDate;
            theLastFileDate = this.getLastFileDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFileDate", theLastFileDate), currentHashCode, theLastFileDate, (this.lastFileDate!= null));
        }
        {
            IntuitAnyType theTaxAgencyExt;
            theTaxAgencyExt = this.getTaxAgencyExt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAgencyExt", theTaxAgencyExt), currentHashCode, theTaxAgencyExt, (this.taxAgencyExt!= null));
        }
        {
            String theTaxAgencyConfig;
            theTaxAgencyConfig = this.getTaxAgencyConfig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAgencyConfig", theTaxAgencyConfig), currentHashCode, theTaxAgencyConfig, (this.taxAgencyConfig!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
