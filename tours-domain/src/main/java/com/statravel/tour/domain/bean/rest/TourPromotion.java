package com.statravel.tour.domain.bean.rest;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourPromotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourPromotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountPercentage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourPromotion", propOrder = {
        "startDate",
        "originalPrice",
        "discountPrice",
        "discountPercentage",
        "promoCode"
})
public class TourPromotion implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 6971093831415001505L;
    private static final int HASH_PRIME_NUMBER = 31;

    @XmlElement(required = true)
    protected Date startDate;
    @XmlElement(required = true)
    protected Double originalPrice;
    @XmlElement(required = true)
    protected Double discountPrice;
    @XmlElement(required = true)
    protected Double discountPercentage;
    @XmlElement(required = true)
    protected String promoCode;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param date
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setStartDate(Date date) {
        this.startDate = date;
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public Double getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param double1
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setOriginalPrice(Double double1) {
        this.originalPrice = double1;
    }

    /**
     * Gets the value of the discountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public Double getDiscountPrice() {
        return discountPrice;
    }

    /**
     * Sets the value of the discountPrice property.
     * 
     * @param double1
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setDiscountPrice(Double double1) {
        this.discountPrice = double1;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param double1
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setDiscountPercentage(Double double1) {
        this.discountPercentage = double1;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = HASH_PRIME_NUMBER;
        int result = 1;
        result = prime
                * result
                + ((discountPercentage == null) ? 0 : discountPercentage
                        .hashCode());
        result = prime * result
                + ((discountPrice == null) ? 0 : discountPrice.hashCode());
        result = prime * result
                + ((originalPrice == null) ? 0 : originalPrice.hashCode());
        result = prime * result
                + ((promoCode == null) ? 0 : promoCode.hashCode());
        result = prime * result
                + ((startDate == null) ? 0 : startDate.hashCode());
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
        TourPromotion other = (TourPromotion) obj;
        if (discountPercentage == null) {
            if (other.discountPercentage != null)
                return false;
        } else if (!discountPercentage.equals(other.discountPercentage))
            return false;
        if (discountPrice == null) {
            if (other.discountPrice != null)
                return false;
        } else if (!discountPrice.equals(other.discountPrice))
            return false;
        if (originalPrice == null) {
            if (other.originalPrice != null)
                return false;
        } else if (!originalPrice.equals(other.originalPrice))
            return false;
        if (promoCode == null) {
            if (other.promoCode != null)
                return false;
        } else if (!promoCode.equals(other.promoCode))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TourPromotion [startDate=" + startDate + ", originalPrice="
                + originalPrice + ", discountPrice=" + discountPrice
                + ", discountPercentage=" + discountPercentage + ", promoCode="
                + promoCode + "]";
    }

}
