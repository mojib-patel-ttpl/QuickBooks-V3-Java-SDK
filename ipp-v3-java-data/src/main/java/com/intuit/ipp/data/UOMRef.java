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
 * When a unit of measure is referenced, it must
 * 				include the name of the specific unit used as well as the unit of
 * 				measure set in which that unit is defined. This entity captures that
 * 				concept.
 * 
 * <p>Java class for UOMRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOMRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UOMSetRef" type="{http://schema.intuit.com/finance/v3}ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOMRef", propOrder = {
    "unit",
    "uomSetRef"
})
public class UOMRef
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    @XmlElement(name = "UOMSetRef", required = true)
    protected ReferenceType uomSetRef;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the uomSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUOMSetRef() {
        return uomSetRef;
    }

    /**
     * Sets the value of the uomSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUOMSetRef(ReferenceType value) {
        this.uomSetRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UOMRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UOMRef that = ((UOMRef) object);
        {
            String lhsUnit;
            lhsUnit = this.getUnit();
            String rhsUnit;
            rhsUnit = that.getUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit)) {
                return false;
            }
        }
        {
            ReferenceType lhsUOMSetRef;
            lhsUOMSetRef = this.getUOMSetRef();
            ReferenceType rhsUOMSetRef;
            rhsUOMSetRef = that.getUOMSetRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomSetRef", lhsUOMSetRef), LocatorUtils.property(thatLocator, "uomSetRef", rhsUOMSetRef), lhsUOMSetRef, rhsUOMSetRef)) {
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
        int currentHashCode = 1;
        {
            String theUnit;
            theUnit = this.getUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unit", theUnit), currentHashCode, theUnit);
        }
        {
            ReferenceType theUOMSetRef;
            theUOMSetRef = this.getUOMSetRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomSetRef", theUOMSetRef), currentHashCode, theUOMSetRef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}