//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 05:00:20 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Draft"/&gt;
 *     &lt;enumeration value="Overdue"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Payable"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Trash"/&gt;
 *     &lt;enumeration value="UnPaid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusEnum")
@XmlEnum
public enum PaymentStatusEnum {

    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Overdue")
    OVERDUE("Overdue"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Payable")
    PAYABLE("Payable"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Trash")
    TRASH("Trash"),
    @XmlEnumValue("UnPaid")
    UN_PAID("UnPaid");
    private final String value;

    PaymentStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusEnum fromValue(String v) {
        for (PaymentStatusEnum c: PaymentStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
