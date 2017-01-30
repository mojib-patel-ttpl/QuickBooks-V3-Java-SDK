/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * The UOM type defines the data used to represent a
 * 				set of equivalent units and the conversion rates to other related
 * 				units. It allows showing what quantities, prices, rates, and costs
 * 				are based on.	
 * 
 * <p>Java class for UOM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOM">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abbrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseType" type="{http://schema.intuit.com/finance/v3}UOMBaseTypeEnum" minOccurs="0"/>
 *         &lt;element name="ConvUnit" type="{http://schema.intuit.com/finance/v3}UOMConvUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOM", propOrder = {
    "name",
    "abbrv",
    "baseType",
    "convUnit"
})
public class UOM
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Abbrv")
    protected String abbrv;
    @XmlElement(name = "BaseType")
    protected UOMBaseTypeEnum baseType;
    @XmlElement(name = "ConvUnit")
    protected List<UOMConvUnit> convUnit;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrv() {
        return abbrv;
    }

    /**
     * Sets the value of the abbrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrv(String value) {
        this.abbrv = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link UOMBaseTypeEnum }
     *     
     */
    public UOMBaseTypeEnum getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMBaseTypeEnum }
     *     
     */
    public void setBaseType(UOMBaseTypeEnum value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the convUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOMConvUnit }
     * 
     * 
     */
    public List<UOMConvUnit> getConvUnit() {
        if (convUnit == null) {
            convUnit = new ArrayList<UOMConvUnit>();
        }
        return this.convUnit;
    }

    /**
     * Sets the value of the convUnit property.
     * 
     * @param convUnit
     *     allowed object is
     *     {@link UOMConvUnit }
     *     
     */
    public void setConvUnit(List<UOMConvUnit> convUnit) {
        this.convUnit = convUnit;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UOM)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UOM that = ((UOM) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsAbbrv;
            lhsAbbrv = this.getAbbrv();
            String rhsAbbrv;
            rhsAbbrv = that.getAbbrv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbrv", lhsAbbrv), LocatorUtils.property(thatLocator, "abbrv", rhsAbbrv), lhsAbbrv, rhsAbbrv)) {
                return false;
            }
        }
        {
            UOMBaseTypeEnum lhsBaseType;
            lhsBaseType = this.getBaseType();
            UOMBaseTypeEnum rhsBaseType;
            rhsBaseType = that.getBaseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseType", lhsBaseType), LocatorUtils.property(thatLocator, "baseType", rhsBaseType), lhsBaseType, rhsBaseType)) {
                return false;
            }
        }
        {
            List<UOMConvUnit> lhsConvUnit;
            lhsConvUnit = (((this.convUnit!= null)&&(!this.convUnit.isEmpty()))?this.getConvUnit():null);
            List<UOMConvUnit> rhsConvUnit;
            rhsConvUnit = (((that.convUnit!= null)&&(!that.convUnit.isEmpty()))?that.getConvUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convUnit", lhsConvUnit), LocatorUtils.property(thatLocator, "convUnit", rhsConvUnit), lhsConvUnit, rhsConvUnit)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theAbbrv;
            theAbbrv = this.getAbbrv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbrv", theAbbrv), currentHashCode, theAbbrv);
        }
        {
            UOMBaseTypeEnum theBaseType;
            theBaseType = this.getBaseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseType", theBaseType), currentHashCode, theBaseType);
        }
        {
            List<UOMConvUnit> theConvUnit;
            theConvUnit = (((this.convUnit!= null)&&(!this.convUnit.isEmpty()))?this.getConvUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convUnit", theConvUnit), currentHashCode, theConvUnit);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}