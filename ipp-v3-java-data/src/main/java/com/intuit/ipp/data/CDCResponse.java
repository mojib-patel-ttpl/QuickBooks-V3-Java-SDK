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
import javax.xml.bind.annotation.XmlAttribute;
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
 * QueryResponse entity describing the response of query
 * 
 * <p>Java class for CDCResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDCResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="QueryResponse" type="{http://schema.intuit.com/finance/v3}QueryResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Fault" type="{http://schema.intuit.com/finance/v3}Fault" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDCResponse", propOrder = {
    "queryResponse",
    "fault"
})
public class CDCResponse
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QueryResponse")
    protected List<QueryResponse> queryResponse;
    @XmlElement(name = "Fault")
    protected Fault fault;
    @XmlAttribute(name = "size")
    protected Integer size;

    /**
     * Gets the value of the queryResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResponse }
     * 
     * 
     */
    public List<QueryResponse> getQueryResponse() {
        if (queryResponse == null) {
            queryResponse = new ArrayList<QueryResponse>();
        }
        return this.queryResponse;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Sets the value of the queryResponse property.
     * 
     * @param queryResponse
     *     allowed object is
     *     {@link QueryResponse }
     *     
     */
    public void setQueryResponse(List<QueryResponse> queryResponse) {
        this.queryResponse = queryResponse;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CDCResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CDCResponse that = ((CDCResponse) object);
        {
            List<QueryResponse> lhsQueryResponse;
            lhsQueryResponse = (((this.queryResponse!= null)&&(!this.queryResponse.isEmpty()))?this.getQueryResponse():null);
            List<QueryResponse> rhsQueryResponse;
            rhsQueryResponse = (((that.queryResponse!= null)&&(!that.queryResponse.isEmpty()))?that.getQueryResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryResponse", lhsQueryResponse), LocatorUtils.property(thatLocator, "queryResponse", rhsQueryResponse), lhsQueryResponse, rhsQueryResponse)) {
                return false;
            }
        }
        {
            Fault lhsFault;
            lhsFault = this.getFault();
            Fault rhsFault;
            rhsFault = that.getFault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault)) {
                return false;
            }
        }
        {
            Integer lhsSize;
            lhsSize = this.getSize();
            Integer rhsSize;
            rhsSize = that.getSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
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
            List<QueryResponse> theQueryResponse;
            theQueryResponse = (((this.queryResponse!= null)&&(!this.queryResponse.isEmpty()))?this.getQueryResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryResponse", theQueryResponse), currentHashCode, theQueryResponse);
        }
        {
            Fault theFault;
            theFault = this.getFault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault);
        }
        {
            Integer theSize;
            theSize = this.getSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}