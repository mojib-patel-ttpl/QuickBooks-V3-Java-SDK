//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="create"/&gt;
 *     &lt;enumeration value="update"/&gt;
 *     &lt;enumeration value="revert"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="void"/&gt;
 *     &lt;enumeration value="send"/&gt;
 *     &lt;enumeration value="merge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationEnum")
@XmlEnum
public enum OperationEnum {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("revert")
    REVERT("revert"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("void")
    VOID("void"),
    @XmlEnumValue("send")
    SEND("send"),
    @XmlEnumValue("merge")
    MERGE("merge");
    private final String value;

    OperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationEnum fromValue(String v) {
        for (OperationEnum c: OperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
