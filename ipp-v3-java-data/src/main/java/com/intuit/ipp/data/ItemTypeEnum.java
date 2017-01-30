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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Assembly"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="Fixed Asset"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="NonInventory"/>
 *     &lt;enumeration value="Other Charge"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Subtotal"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Tax Group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemTypeEnum")
@XmlEnum
public enum ItemTypeEnum {

    @XmlEnumValue("Assembly")
    ASSEMBLY("Assembly"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Fixed Asset")
    FIXED_ASSET("Fixed Asset"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("NonInventory")
    NON_INVENTORY("NonInventory"),
    @XmlEnumValue("Other Charge")
    OTHER_CHARGE("Other Charge"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Subtotal")
    SUBTOTAL("Subtotal"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Tax Group")
    TAX_GROUP("Tax Group");
    private final String value;

    ItemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemTypeEnum fromValue(String v) {
        for (ItemTypeEnum c: ItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}