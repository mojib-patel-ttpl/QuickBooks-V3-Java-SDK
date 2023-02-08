//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
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
 * Defines VendorAndPurchase Prefs details
 * 			
 * 
 * <p>Java class for TimeTrackingPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTrackingPrefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseServices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultTimeItem" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="BillCustomers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowBillRateToAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkWeekStartDate" type="{http://schema.intuit.com/finance/v3}WeekEnum" minOccurs="0"/&gt;
 *         &lt;element name="TimeTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MarkTimeEntriesBillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MarkExpensesAsBillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTrackingPrefs", propOrder = {
    "useServices",
    "defaultTimeItem",
    "billCustomers",
    "showBillRateToAll",
    "workWeekStartDate",
    "timeTrackingEnabled",
    "markTimeEntriesBillable",
    "markExpensesAsBillable"
})
public class TimeTrackingPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UseServices")
    protected Boolean useServices;
    @XmlElement(name = "DefaultTimeItem")
    protected ReferenceType defaultTimeItem;
    @XmlElement(name = "BillCustomers")
    protected Boolean billCustomers;
    @XmlElement(name = "ShowBillRateToAll")
    protected Boolean showBillRateToAll;
    @XmlElement(name = "WorkWeekStartDate")
    @XmlSchemaType(name = "string")
    protected WeekEnum workWeekStartDate;
    @XmlElement(name = "TimeTrackingEnabled")
    protected Boolean timeTrackingEnabled;
    @XmlElement(name = "MarkTimeEntriesBillable")
    protected Boolean markTimeEntriesBillable;
    @XmlElement(name = "MarkExpensesAsBillable")
    protected Boolean markExpensesAsBillable;

    /**
     * Gets the value of the useServices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseServices() {
        return useServices;
    }

    /**
     * Sets the value of the useServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseServices(Boolean value) {
        this.useServices = value;
    }

    /**
     * Gets the value of the defaultTimeItem property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefaultTimeItem() {
        return defaultTimeItem;
    }

    /**
     * Sets the value of the defaultTimeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefaultTimeItem(ReferenceType value) {
        this.defaultTimeItem = value;
    }

    /**
     * Gets the value of the billCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillCustomers() {
        return billCustomers;
    }

    /**
     * Sets the value of the billCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillCustomers(Boolean value) {
        this.billCustomers = value;
    }

    /**
     * Gets the value of the showBillRateToAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowBillRateToAll() {
        return showBillRateToAll;
    }

    /**
     * Sets the value of the showBillRateToAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowBillRateToAll(Boolean value) {
        this.showBillRateToAll = value;
    }

    /**
     * Gets the value of the workWeekStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link WeekEnum }
     *     
     */
    public WeekEnum getWorkWeekStartDate() {
        return workWeekStartDate;
    }

    /**
     * Sets the value of the workWeekStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekEnum }
     *     
     */
    public void setWorkWeekStartDate(WeekEnum value) {
        this.workWeekStartDate = value;
    }

    /**
     * Gets the value of the timeTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeTrackingEnabled() {
        return timeTrackingEnabled;
    }

    /**
     * Sets the value of the timeTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeTrackingEnabled(Boolean value) {
        this.timeTrackingEnabled = value;
    }

    /**
     * Gets the value of the markTimeEntriesBillable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkTimeEntriesBillable() {
        return markTimeEntriesBillable;
    }

    /**
     * Sets the value of the markTimeEntriesBillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkTimeEntriesBillable(Boolean value) {
        this.markTimeEntriesBillable = value;
    }

    /**
     * Gets the value of the markExpensesAsBillable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkExpensesAsBillable() {
        return markExpensesAsBillable;
    }

    /**
     * Sets the value of the markExpensesAsBillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkExpensesAsBillable(Boolean value) {
        this.markExpensesAsBillable = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTrackingPrefs that = ((TimeTrackingPrefs) object);
        {
            Boolean lhsUseServices;
            lhsUseServices = this.isUseServices();
            Boolean rhsUseServices;
            rhsUseServices = that.isUseServices();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useServices", lhsUseServices), LocatorUtils.property(thatLocator, "useServices", rhsUseServices), lhsUseServices, rhsUseServices, (this.useServices!= null), (that.useServices!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDefaultTimeItem;
            lhsDefaultTimeItem = this.getDefaultTimeItem();
            ReferenceType rhsDefaultTimeItem;
            rhsDefaultTimeItem = that.getDefaultTimeItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultTimeItem", lhsDefaultTimeItem), LocatorUtils.property(thatLocator, "defaultTimeItem", rhsDefaultTimeItem), lhsDefaultTimeItem, rhsDefaultTimeItem, (this.defaultTimeItem!= null), (that.defaultTimeItem!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBillCustomers;
            lhsBillCustomers = this.isBillCustomers();
            Boolean rhsBillCustomers;
            rhsBillCustomers = that.isBillCustomers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billCustomers", lhsBillCustomers), LocatorUtils.property(thatLocator, "billCustomers", rhsBillCustomers), lhsBillCustomers, rhsBillCustomers, (this.billCustomers!= null), (that.billCustomers!= null))) {
                return false;
            }
        }
        {
            Boolean lhsShowBillRateToAll;
            lhsShowBillRateToAll = this.isShowBillRateToAll();
            Boolean rhsShowBillRateToAll;
            rhsShowBillRateToAll = that.isShowBillRateToAll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showBillRateToAll", lhsShowBillRateToAll), LocatorUtils.property(thatLocator, "showBillRateToAll", rhsShowBillRateToAll), lhsShowBillRateToAll, rhsShowBillRateToAll, (this.showBillRateToAll!= null), (that.showBillRateToAll!= null))) {
                return false;
            }
        }
        {
            WeekEnum lhsWorkWeekStartDate;
            lhsWorkWeekStartDate = this.getWorkWeekStartDate();
            WeekEnum rhsWorkWeekStartDate;
            rhsWorkWeekStartDate = that.getWorkWeekStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workWeekStartDate", lhsWorkWeekStartDate), LocatorUtils.property(thatLocator, "workWeekStartDate", rhsWorkWeekStartDate), lhsWorkWeekStartDate, rhsWorkWeekStartDate, (this.workWeekStartDate!= null), (that.workWeekStartDate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTimeTrackingEnabled;
            lhsTimeTrackingEnabled = this.isTimeTrackingEnabled();
            Boolean rhsTimeTrackingEnabled;
            rhsTimeTrackingEnabled = that.isTimeTrackingEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeTrackingEnabled", lhsTimeTrackingEnabled), LocatorUtils.property(thatLocator, "timeTrackingEnabled", rhsTimeTrackingEnabled), lhsTimeTrackingEnabled, rhsTimeTrackingEnabled, (this.timeTrackingEnabled!= null), (that.timeTrackingEnabled!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMarkTimeEntriesBillable;
            lhsMarkTimeEntriesBillable = this.isMarkTimeEntriesBillable();
            Boolean rhsMarkTimeEntriesBillable;
            rhsMarkTimeEntriesBillable = that.isMarkTimeEntriesBillable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markTimeEntriesBillable", lhsMarkTimeEntriesBillable), LocatorUtils.property(thatLocator, "markTimeEntriesBillable", rhsMarkTimeEntriesBillable), lhsMarkTimeEntriesBillable, rhsMarkTimeEntriesBillable, (this.markTimeEntriesBillable!= null), (that.markTimeEntriesBillable!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMarkExpensesAsBillable;
            lhsMarkExpensesAsBillable = this.isMarkExpensesAsBillable();
            Boolean rhsMarkExpensesAsBillable;
            rhsMarkExpensesAsBillable = that.isMarkExpensesAsBillable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markExpensesAsBillable", lhsMarkExpensesAsBillable), LocatorUtils.property(thatLocator, "markExpensesAsBillable", rhsMarkExpensesAsBillable), lhsMarkExpensesAsBillable, rhsMarkExpensesAsBillable, (this.markExpensesAsBillable!= null), (that.markExpensesAsBillable!= null))) {
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
            Boolean theUseServices;
            theUseServices = this.isUseServices();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useServices", theUseServices), currentHashCode, theUseServices, (this.useServices!= null));
        }
        {
            ReferenceType theDefaultTimeItem;
            theDefaultTimeItem = this.getDefaultTimeItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultTimeItem", theDefaultTimeItem), currentHashCode, theDefaultTimeItem, (this.defaultTimeItem!= null));
        }
        {
            Boolean theBillCustomers;
            theBillCustomers = this.isBillCustomers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billCustomers", theBillCustomers), currentHashCode, theBillCustomers, (this.billCustomers!= null));
        }
        {
            Boolean theShowBillRateToAll;
            theShowBillRateToAll = this.isShowBillRateToAll();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showBillRateToAll", theShowBillRateToAll), currentHashCode, theShowBillRateToAll, (this.showBillRateToAll!= null));
        }
        {
            WeekEnum theWorkWeekStartDate;
            theWorkWeekStartDate = this.getWorkWeekStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workWeekStartDate", theWorkWeekStartDate), currentHashCode, theWorkWeekStartDate, (this.workWeekStartDate!= null));
        }
        {
            Boolean theTimeTrackingEnabled;
            theTimeTrackingEnabled = this.isTimeTrackingEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeTrackingEnabled", theTimeTrackingEnabled), currentHashCode, theTimeTrackingEnabled, (this.timeTrackingEnabled!= null));
        }
        {
            Boolean theMarkTimeEntriesBillable;
            theMarkTimeEntriesBillable = this.isMarkTimeEntriesBillable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markTimeEntriesBillable", theMarkTimeEntriesBillable), currentHashCode, theMarkTimeEntriesBillable, (this.markTimeEntriesBillable!= null));
        }
        {
            Boolean theMarkExpensesAsBillable;
            theMarkExpensesAsBillable = this.isMarkExpensesAsBillable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markExpensesAsBillable", theMarkExpensesAsBillable), currentHashCode, theMarkExpensesAsBillable, (this.markExpensesAsBillable!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
