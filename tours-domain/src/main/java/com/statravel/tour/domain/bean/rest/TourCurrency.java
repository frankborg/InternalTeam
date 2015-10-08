package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourCurrency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourCurrency", propOrder = {
        "currencyCode",
        "currencySymbol"
})
public class TourCurrency implements Serializable{

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -5758072082880674406L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    protected String currencyCode;
    @XmlElement(required = true)
    protected String currencySymbol;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Sets the value of the currencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = HASH_PRIME_NUMBER;
        int result = 1;
        result = prime * result
                + ((currencyCode == null) ? 0 : currencyCode.hashCode());
        result = prime * result
                + ((currencySymbol == null) ? 0 : currencySymbol.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TourCurrency other = (TourCurrency) obj;
        if (currencyCode == null) {
            if (other.currencyCode != null)
                return false;
        } else if (!currencyCode.equals(other.currencyCode))
            return false;
        if (currencySymbol == null) {
            if (other.currencySymbol != null)
                return false;
        } else if (!currencySymbol.equals(other.currencySymbol))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TourCurrency [currencyCode=" + currencyCode
                + ", currencySymbol=" + currencySymbol + "]";
    }

}
